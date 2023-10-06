package org.example.pattern.auxiliary;

import org.example.auxiliary.Address;
import org.example.auxiliary.Gender;
import org.example.auxiliary.Work;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public abstract class UserTest {

    protected Long id;
    protected String name;
    protected byte age;
    protected Address address;
    protected Work work;
    protected Gender gender;
    protected User rawUser;
    protected User user;
    protected User2 user2;
    protected boolean driverLicense = true;

    @BeforeEach
    public void setUp() {
        id = 1L;
        name = "Magyar Zoltán";
        age = (byte) 28;
        address = new Address("Magyarország", "Tessedik", 5540);
        work = () -> System.out.println("Programing");
        gender = Gender.MALE;
        user = new User(id, name, age, address, work, gender);
        user2 = new User2(id, name.split(" ")[0], name.split(" ")[1], driverLicense, address, work, gender);
    }

    @Test
    public abstract void test();
}