package org.example.pattern.behavioral;

import org.example.pattern.auxiliary.UserTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VisitorTest
        extends UserTest
        implements BehavioralTest {

    Visitor.Sub3Visitor sub3;

    @Test
    @Override
    public void test() {
        assertDoesNotThrow(() -> sub3 = new Visitor.Sub3Visitor());
        sub3.accept(new Visitor.VisitorImp());
        System.out.println(sub3.message());
    }
}