package org.example.test.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

public class AssumeTest {

    private Calculator calculator = new Calculator();
    private BankAccount bankAccount;

    @Test
    public void test_assumeTrue() {
        assumeTrue(calculator.divide(30, 2) != 15, "disabled");
    }

    @Test
    public void test_assumeFalse() {
        assumeFalse(calculator.divide(30, 2) != 16);
    }

    @Test
    public void test_assumingThat() {
        bankAccount = new BankAccount(500.0, 0);
        assumingThat(bankAccount == null , () -> assertTrue(bankAccount.isActive()));
    }

    @Test
    @DisplayName("Test activation account after creation")
    public void test_assume_active(){
        bankAccount = new BankAccount(500.0, 0);
        assumeTrue(bankAccount == null, "Account is null");
        assertTrue(bankAccount.isActive());
    }
}