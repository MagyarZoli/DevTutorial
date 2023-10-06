package org.example.pattern.behavioral;

import org.example.pattern.auxiliary.UserTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ObserverTest
        extends UserTest
        implements BehavioralTest {

    private Observer.Connection user3;
    private Observer.Connection user4;
    private Observer feed;

    @Test
    @Override
    public void test() {
        assertDoesNotThrow(() -> user3 = new Observer.Connection());
        assertDoesNotThrow(() -> user4 = new Observer.Connection());
        assertDoesNotThrow(() -> feed = new Observer());

        assertDoesNotThrow(() -> user3.addPropertyChangeListener(feed));
        assertDoesNotThrow(() -> user4.addPropertyChangeListener(feed));

        user3.setStatus("user3");
        user4.setStatus("user4");
        feed.printStatuses();
    }
}