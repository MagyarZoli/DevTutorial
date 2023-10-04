package org.example.pattern.creational;

import org.example.pattern.auxiliary.Address;
import org.example.pattern.auxiliary.Gender;
import org.example.pattern.auxiliary.User;
import org.example.pattern.auxiliary.Work;

public class Builder {

    private Long id;
    private String name;
    private byte age;
    private Address address;
    private Work work;
    private Gender gender;

    public Builder setId(Long id) {
        this.id = id;
        return this;
    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public Builder setAge(byte age) {
        this.age = age;
        return this;
    }

    public Builder setAddress(Address address) {
        this.address = address;
        return this;
    }

    public Builder setWork(Work work) {
        this.work = work;
        return this;
    }

    public Builder setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public User createUser() {
        return new User(id, name, age, address, work, gender);
    }
}