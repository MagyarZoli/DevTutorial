package org.example.pattern.structural;

import org.example.pattern.auxiliary.UserTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompositeTest
        extends UserTest {

    Composite composite;
    Composite composite2;

    @Test
    public void test_Composite_Pattern() {
        assertDoesNotThrow(() -> composite = user);
        assertDoesNotThrow(() -> composite2 = user2);
        assertNotNull(composite);
        assertNotNull(composite2);
        composite.getPayment(1_000.0F);
        composite2.getPayment(1_000.0F);
    }
}