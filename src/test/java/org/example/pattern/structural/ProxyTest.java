package org.example.pattern.structural;

import org.example.auxiliary.Gender;
import org.example.pattern.auxiliary.User;
import org.example.pattern.auxiliary.UserTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProxyTest
        extends UserTest
        implements StructuralTest {

    @Test
    @Override
    public void test() {
        assertDoesNotThrow(() -> rawUser = new Proxy(User.builder()
                .name("Proxy Name")
                .age((byte) 20)
                .gender(Gender.MALE).build()));
        System.out.println(rawUser);
    }
}