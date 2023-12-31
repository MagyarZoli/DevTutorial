package org.example.pattern.structural;

import org.example.pattern.auxiliary.Payment;
import org.example.pattern.auxiliary.UserTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DecoratorTest
        extends UserTest
        implements StructuralTest {

    private float payment = 1_000.0F;
    private Payment user3;

    @Test
    @Override
    public void test() {
        user.getPayment(payment);
        assertDoesNotThrow(() -> user3 = new Decorator(user));
        user3.getPayment(payment);
    }
}