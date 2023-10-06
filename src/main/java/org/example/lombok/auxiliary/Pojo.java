package org.example.lombok.auxiliary;

import org.example.auxiliary.Gender;

import java.util.Objects;

public class Pojo {

    private Long id;
    private String name;
    private byte age;
    private Gender gender;

    public Pojo() {}

    public Pojo(String name) {
        this.name = name;
    }

    public Pojo(Long id, String name, byte age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public byte getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Pojo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pojo pojo = (Pojo) o;
        return age == pojo.age && name.equals(pojo.name) && gender == pojo.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }
}