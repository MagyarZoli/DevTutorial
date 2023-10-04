package org.example.pattern.auxiliary;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User
        implements Comparable<User>, Person{

    private Long id;
    private String name;
    private byte age;
    private Address address;
    private Work work;
    private Gender gender;

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
}