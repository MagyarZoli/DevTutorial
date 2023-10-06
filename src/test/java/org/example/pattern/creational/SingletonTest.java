package org.example.pattern.creational;

import org.example.pattern.auxiliary.User;
import org.example.pattern.auxiliary.UserTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest
        extends UserTest
        implements CreationalTest {

    private User user2;

    @Test
    @Override
    public void test() {
        assertDoesNotThrow(() -> user = Singleton.getInstance(user));
        assertNotNull(user);
        assertDoesNotThrow(() -> user2 = Singleton.getInstance(user));
        assertEquals(0, user.compareTo(user2));
        assertEquals(0, user.hashCode() - user2.hashCode());
    }
}