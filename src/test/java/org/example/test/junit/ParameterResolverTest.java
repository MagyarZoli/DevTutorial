package org.example.test.junit;

import org.example.auxiliary.Day;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(ParameterResolverTest.ParameterResolverExtends.class)
public class ParameterResolverTest {

    @Test
    public void test_assert_withdraw(BankAccount bankAccount) {
        assertDoesNotThrow(() -> bankAccount.withdraw(300.0));
        assertEquals(700.0, bankAccount.getBalance());
    }

    @RepeatedTest(3)
    public void test_assert_deposit(BankAccount bankAccount, RepetitionInfo repetitionInfo){
        assertDoesNotThrow(() -> bankAccount.deposit(500.0));
        assertEquals(1_500.0, bankAccount.getBalance());
        System.out.printf("%d/%d%n",
                repetitionInfo.getCurrentRepetition(),
                repetitionInfo.getTotalRepetitions());
    }

    @ParameterizedTest
    @ValueSource(doubles = {100.0, 400.0, 800.0, 1_000.0})
    public void test_assert_deposit2(double amount, BankAccount bankAccount){
        assertDoesNotThrow(() -> bankAccount.deposit(amount));
        assertTrue(1_000.0 < bankAccount.getBalance());
    }

    @ParameterizedTest
    @MethodSource(value = "methodSource")
    public void parameterizedTest_ValueSource(Object amount, BankAccount bankAccount) {
        assertDoesNotThrow(() -> bankAccount.deposit((Double) amount));
        assertTrue(1_000.0 < bankAccount.getBalance());
    }

    private static Iterable<Object> methodSource() {
        return List.of(4.0, 0.1, 6.0, 60_000.0, 400_00.0);
    }

    public static class ParameterResolverExtends
            implements ParameterResolver {

        @Override
        public boolean supportsParameter(
                ParameterContext parameterContext,
                ExtensionContext extensionContext)
                throws ParameterResolutionException {
            return parameterContext.getParameter().getType() == BankAccount.class;
        }

        @Override
        public Object resolveParameter(
                ParameterContext parameterContext,
                ExtensionContext extensionContext)
                throws ParameterResolutionException {
            return new BankAccount(1_000, 0);
        }
    }
}