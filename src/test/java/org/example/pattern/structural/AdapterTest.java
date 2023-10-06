package org.example.pattern.structural;

import org.example.pattern.auxiliary.User2;
import org.example.pattern.auxiliary.UserTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdapterTest
        extends UserTest
        implements StructuralTest {

    private User2 user3;

    @Test
    @Override
    public void test() {
        assertDoesNotThrow(() -> user3 = user2);
        Adapter adapter = new Adapter(user3);
        adapter.getPayment(1000.0f);
    }

}