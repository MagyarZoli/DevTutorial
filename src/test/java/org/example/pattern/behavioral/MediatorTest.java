package org.example.pattern.behavioral;

import org.example.pattern.auxiliary.UserTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MediatorTest
        extends UserTest
        implements BehavioralTest {

    Mediator mediator;

    @Test
    @Override
    public void test() {
        assertDoesNotThrow(() -> mediator = new Mediator(user));
        assertNotNull(mediator);
        mediator.buy("pens", 300.0F, 3);
    }
}