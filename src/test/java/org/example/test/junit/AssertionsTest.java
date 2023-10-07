package org.example.test.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("AssertionsTest for the test method")
public class AssertionsTest {

    private Calculator calculator = new Calculator();
    private BankAccount bankAccount;

    @Test
    public void test_assertEquals() {
        int expected = 3;
        int actual = calculator.sum(1,2);
        assertEquals(expected, actual);
    }

    @Test
    public void test_assertTrue() {
        boolean actual = calculator.isEven(2);
        assertTrue(actual);
    }

    @Test
    public void test_assertFalse() {
        boolean actual = calculator.isEven(1);
        assertFalse(actual);
    }

    @Test
    public void test_assertArrayEquals() {
        int[] expected = new int[]{2, 3, 4};
        int[] actual = calculator.incrementArray(new int[]{1 ,2, 3});
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_assertThrows() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(1, 0));
        String expected = "Ints cannot bo divided by zero";
        String actual = exception.getMessage();
        assertEquals(expected, actual);
    }

    @Test
    public void test_assertDoesNotThrow() {
        assertDoesNotThrow(() -> calculator.divide(3, -2));
    }

    @Test
    public void test_assertNotNull() {
        assertNotNull(calculator);
    }

    @Test
    public void test_assertNull() {
        Calculator calculator2 = null;
        assertNull(calculator2);
    }

    @Test
    @DisplayName("Withdraw 500 successfully")
    public void test_assert_withdraw() {
        assertDoesNotThrow(() -> bankAccount = new BankAccount(500.0, -1_000.0));
        assertDoesNotThrow(() -> bankAccount.withdraw(300.0));
        assertEquals(200.0, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Deposit 400 successfully")
    public void test_assert_deposit(){
        assertDoesNotThrow(() -> bankAccount = new BankAccount(400.0, 0.0));
        assertDoesNotThrow(() -> bankAccount.deposit(500.0));
        assertEquals(900.0, bankAccount.getBalance());
    }
}