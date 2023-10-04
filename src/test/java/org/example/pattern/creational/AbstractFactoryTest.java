package org.example.pattern.creational;

import org.example.pattern.auxiliary.UserTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AbstractFactoryTest
        extends UserTest {

    private AbstractFactory factoryMethod = new FactoryMethod();

    @Test
    public void test_FactoryMethod_Pattern() {
        assertDoesNotThrow(() -> {
            factoryMethod.getPersonPackage(7, "user");
            factoryMethod.getPersonPackage(14, "User2");
        });
    }
}