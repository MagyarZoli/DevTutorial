package org.example.pattern.structural;

import org.example.pattern.auxiliary.User;
import org.example.pattern.auxiliary.UserTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BridgeTest
        extends UserTest
        implements StructuralTest {

    @Test
    @Override
    public void test() {
        assertDoesNotThrow(() -> rawUser = new User(new Bridge("Bridge Name"), user));
        assertNotNull(rawUser);
        System.out.println(rawUser);
        assertNotEquals(0, rawUser.compareTo(user));
    }
}