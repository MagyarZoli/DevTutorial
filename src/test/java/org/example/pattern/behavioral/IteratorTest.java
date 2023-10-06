package org.example.pattern.behavioral;

import org.example.pattern.auxiliary.Document;
import org.example.pattern.auxiliary.User;
import org.example.pattern.auxiliary.UserTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IteratorTest
        extends UserTest
        implements BehavioralTest {

    Iterator iterator;
    Iterator.SubIterator subIterator;
    Document user3;

    @Test
    @Override
    public void test() {
        assertDoesNotThrow(() -> iterator = new Iterator(user, user2, user));
        assertNotNull(iterator);
        assertDoesNotThrow(() -> subIterator = iterator.iterator());
        assertNotNull(subIterator);
        while (subIterator.hasNext()) {
            assertDoesNotThrow(() ->  user3 = subIterator.next());
            assertNotNull(user3);
            System.out.println(user3);
        }
    }
}