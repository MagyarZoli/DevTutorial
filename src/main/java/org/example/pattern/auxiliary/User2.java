package org.example.pattern.auxiliary;

import lombok.*;
import org.example.pattern.behavioral.Command;

import java.util.ArrayList;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User2
        implements Comparable<User2>, Person, Payment, Document{

    private Long id;
    private String firstName;
    private String lastName;
    private boolean driverLicense;
    private Address address;
    private Work work;
    private Gender gender;

    @Override
    public int compareTo(User2 o) {
        if (this.id > o.id) {
            return 1;
        } else if (this.id < o.id) {
            return -1;
        }
        if (this.driverLicense != o.driverLicense) {
           if (o.driverLicense) {
               return 1;
           } else {
               return -1;
           }
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
        return (this.firstName + this.lastName).compareTo(o.firstName + o.lastName);
    }

    @Override
    public List<Person> makePersonPackage(int count) {
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(new User2());
            System.out.println(list.get(i).getClass().getName());
        }
        return list;
    }

    @Override
    public void getPayment(float pay) {
        System.out.println(pay);
    }

    public void command(Command command) {
        command.execute();
    }
}