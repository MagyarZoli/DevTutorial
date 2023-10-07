package org.example.test.junit;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RepeatTest {

    Calculator calculator = new Calculator();

    @RepeatedTest(3)
    public void test_assertTrue() {
        boolean actual = calculator.isEven(2);
        assertTrue(actual);
    }

    @RepeatedTest(3)
    public void test_repeated(RepetitionInfo repetitionInfo){
        boolean actual = calculator.isEven(2);
        assertTrue(actual);
        System.out.printf("%d/%d%n",
                repetitionInfo.getCurrentRepetition(),
                repetitionInfo.getTotalRepetitions());
    }
}