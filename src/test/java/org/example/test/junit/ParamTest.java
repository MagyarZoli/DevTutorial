package org.example.test.junit;

import org.example.auxiliary.Day;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ParamTest {

    Calculator calculator = new Calculator();
    BankAccount bankAccount;

    @ParameterizedTest
    @ValueSource(ints = {2, -2, -100_000, 200_000})
    public void parameterizedTest_ValueSource(int ints) {
        boolean actual = calculator.isEven(ints);
        assertTrue(actual);
    }

    @ParameterizedTest
    @EnumSource(value = Day.class, names = {"SUNDAY", "SATURDAY"})
    public void parameterizedTest_EnumSource(Day names) {
        boolean actual = calculator.isWeekend(names);
        assertTrue(actual);
    }

    @ParameterizedTest
    @MethodSource(value = "methodSource")
    public void parameterizedTest_ValueSource(Object ints) {
        boolean actual = calculator.isEven((Integer) ints);
        assertTrue(actual);
    }

    @ParameterizedTest
    @CsvSource({"100.0, Csv", "200.0, Csv2", "150.0, Csv3"})
    public void parameterizedTest_CsvSource(double amount, String name) {
        assertDoesNotThrow(() -> bankAccount = new BankAccount(0.0, 0.0));
        bankAccount.deposit(amount);
        bankAccount.setHolderName(name);
        assertEquals(amount, bankAccount.getBalance());
        assertEquals(name, bankAccount.getHolderName());
    }

    @Disabled
    @ParameterizedTest
    @CsvFileSource(resources = "ParamTest_CsvFileSource.csv", delimiter = ';')
    public void parameterizedTest_CsvFileSource(double amount, String name) {
        assertDoesNotThrow(() -> bankAccount = new BankAccount(0.0, 0.0));
        bankAccount.deposit(amount);
        bankAccount.setHolderName(name);
        assertEquals(amount, bankAccount.getBalance());
        assertEquals(name, bankAccount.getHolderName());
    }

    private static Iterable<Object> methodSource() {
        return List.of(-4, 0, 6, 60_000, -400_00);
    }
}