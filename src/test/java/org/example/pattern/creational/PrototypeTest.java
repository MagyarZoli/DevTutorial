package org.example.pattern.creational;

import org.example.pattern.auxiliary.User;
import org.example.pattern.auxiliary.UserTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrototypeTest
        extends UserTest {

    private User userClone;

    @Test
    public void test_Prototype_Pattern() {
        assertDoesNotThrow(() -> userClone = new Prototype(user).clone());
        assertNotNull(userClone);
        System.out.println(user);
        System.out.println(userClone);
        user.setId(2L);
        System.out.println(user);
        System.out.println(userClone);
    }
}