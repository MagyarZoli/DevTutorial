package org.example.test.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)
@ExtendWith(ParameterResolverTest.ParameterResolverExtends.class)
public class ParallelTest {

    @Test
    public void test_assert_deposit1(BankAccount bankAccount) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertDoesNotThrow(() -> bankAccount.deposit(500.0));
        assertEquals(1_500.0, bankAccount.getBalance());
    }

    @Test
    public void test_assert_deposit2(BankAccount bankAccount) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertDoesNotThrow(() -> bankAccount.deposit(500.0));
        assertEquals(1_500.0, bankAccount.getBalance());
    }

    @Test
    public void test_assert_deposit3(BankAccount bankAccount) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertDoesNotThrow(() -> bankAccount.deposit(500.0));
        assertEquals(1_500.0, bankAccount.getBalance());
    }
}