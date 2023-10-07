package org.example.test.junit;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NestedTest {

    private BankAccount bankAccount;

    @Test
    public void test_assert_withdraw() {
        assertDoesNotThrow(() -> bankAccount = new BankAccount(500.0, -1_000.0));
        assertDoesNotThrow(() -> bankAccount.withdraw(300.0));
        assertEquals(200.0, bankAccount.getBalance());
    }

    @Test
    public void test_assert_deposit(){
        assertDoesNotThrow(() -> bankAccount = new BankAccount(400.0, 0.0));
        assertDoesNotThrow(() -> bankAccount.deposit(500.0));
        assertEquals(900.0, bankAccount.getBalance());
    }

    @Nested
    class InnerNestedTest {

        @Test
        public void test_assert_withdraw_nested() {
            assertDoesNotThrow(() -> bankAccount = new BankAccount(500.0, -1_000.0));
            assertDoesNotThrow(() -> bankAccount.withdraw(300.0));
            assertEquals(200.0, bankAccount.getBalance());
        }

        @Test
        public void test_assert_deposit_nested(){
            assertDoesNotThrow(() -> bankAccount = new BankAccount(400.0, 0.0));
            assertDoesNotThrow(() -> bankAccount.deposit(500.0));
            assertEquals(900.0, bankAccount.getBalance());
        }
    }
}