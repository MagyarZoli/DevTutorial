package org.example.pattern.behavioral;

import org.example.pattern.auxiliary.UserTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChainOfResponsibilityTest
        extends UserTest {

    @Test
    @Override
    public void test() {
        ChainOfResponsibility chain = new ChainOfResponsibility.SubResponsibility(
                new ChainOfResponsibility.Sub2Responsibility(null));
        chain.open("sub2");
        chain.open("sub");
    }
}