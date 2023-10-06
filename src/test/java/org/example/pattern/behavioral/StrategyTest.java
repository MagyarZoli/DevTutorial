package org.example.pattern.behavioral;

import org.example.pattern.auxiliary.Crypto;
import org.example.pattern.auxiliary.UserTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StrategyTest
        extends UserTest
        implements BehavioralTest {

    Crypto crypto;

    @Test
    @Override
    public void test() {
        crypto = new Crypto("pi");
        assertDoesNotThrow(() -> crypto.encrypt(Strategy.SUBSTRATEGY));
    }
}