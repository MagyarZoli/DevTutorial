package org.example.pattern.behavioral;

import org.example.pattern.auxiliary.UserTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InterpreterTest
        extends UserTest
        implements BehavioralTest {

    Interpreter interpreter3;
    Interpreter interpreter2;
    Interpreter interpreter1;

    @Test
    @Override
    public void test() {
        String context = " Context_ ";
        assertDoesNotThrow(() -> interpreter3 = new Interpreter.Sub3Interpreter());
        assertDoesNotThrow(() -> interpreter2 = new Interpreter.Sub2Interpreter());
        assertDoesNotThrow(() -> interpreter1 = new Interpreter.SubInterpreter());
        System.out.println(interpreter3.interpret(context));
        System.out.println(interpreter2.interpret(context));
        System.out.println(interpreter1.interpret(context));
    }
}