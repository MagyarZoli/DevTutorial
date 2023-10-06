package org.example.pattern.creational;

import lombok.*;
import org.example.auxiliary.Address;
import org.example.auxiliary.Gender;
import org.example.pattern.auxiliary.User;
import org.example.auxiliary.Work;

@Data
@EqualsAndHashCode(callSuper = true)
public class Prototype
        extends User
        implements Cloneable {

    private Long id;
    private String name;
    private byte age;
    private Address address;
    private Work work;
    private Gender gender;

    public Prototype(User user) {
        id = user.getId();
        name = user.getName();
        age = user.getAge();
        address = user.getAddress();
        work = user.getWork();
        gender = user.getGender();
    }

    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}