package org.example.pattern.auxiliary;

import lombok.*;
import org.example.auxiliary.Address;
import org.example.auxiliary.Gender;
import org.example.auxiliary.Work;
import org.example.pattern.behavioral.Command;
import org.example.pattern.structural.Bridge;

import java.util.ArrayList;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User
        implements Comparable<User>, Person, Payment, Document{

    private Long id;
    private String name;
    private byte age;
    private Address address;
    private Work work;
    private Gender gender;

    public User(Bridge bridge, User user) {
        id = user.getId();
        name = bridge.getName();
        age = user.getAge();
        address = user.getAddress();
        work = user.getWork();
        gender = user.getGender();
    }

    @Override
    public int compareTo(User o) {
        if (this.id > o.id) {
            return 1;
        } else if (this.id < o.id) {
            return -1;
        }
        if (this.age > o.age) {
            return 1;
        } else if (this.age < o.id) {
            return -1;
        }
        if (this.address.compareTo(o.address) > 0) {
            return 1;
        } else if (this.address.compareTo(o.address) < 0) {
            return -1;
        }
        if (!this.gender.equals(o.gender)) {
            if (o.gender.equals(Gender.FEMALE)) {
                return 1;
            } else {
                return -1;
            }
        }
        return this.name.compareTo(o.name);
    }

    @Override
    public List<Person> makePersonPackage(int count) {
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(new User());
            System.out.println(list.get(i).getClass().getName());
        }
        return list;
    }

    @Override
    public void getPayment(float pay) {
        System.out.println(pay / 1.27);
    }

    public void command(Command command) {
        command.execute();
    }
}