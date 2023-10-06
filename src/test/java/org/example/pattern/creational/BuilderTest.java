package org.example.pattern.creational;

import org.example.pattern.auxiliary.User;
import org.example.pattern.auxiliary.UserTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BuilderTest
        extends UserTest
        implements CreationalTest {

    @Test
    public void defaultTest() {
        assertDoesNotThrow(() -> rawUser = new User(id, name, age, address, work, gender));
        assertNotNull(rawUser);
        System.out.println(rawUser);
    }

    @Test
    @Override
    public void test() {
        assertDoesNotThrow(() -> rawUser = new Builder()
                .setId(id)
                .setName(name)
                .setAge(age)
                .setGender(gender)
                .setWork(work)
                .setAddress(address).createUser());
        assertNotNull(rawUser);
        System.out.println(rawUser);
    }

    @Test
    public void test_Builder_Lombok() {
        assertDoesNotThrow(() -> rawUser = User.builder()
                .id(id)
                .name(name)
                .age(age)
                .gender(gender)
                .work(work)
                .address(address).build());
        assertNotNull(rawUser);
        System.out.println(rawUser);
    }
}