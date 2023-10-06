package org.example.pattern.creational;

import org.example.pattern.auxiliary.UserTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AbstractFactoryTest
        extends UserTest
        implements CreationalTest {

    private AbstractFactory factoryMethod = new FactoryMethod();

    @Test
    @Override
    public void test() {
        assertDoesNotThrow(() -> {
            factoryMethod.getPersonPackage(7, "user");
            factoryMethod.getPersonPackage(14, "User2");
        });
    }
}