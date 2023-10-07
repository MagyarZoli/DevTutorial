package org.example.test.junit;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
public class BankAccount {

    @NonNull
    private double balance;
    @NonNull
    private double minimumBalance;
    private boolean isActive = true;
    private String holderName;

    public double withdraw(double amount) {
        if (balance - amount > minimumBalance) {
            balance -= amount;
            return amount;
        } else {
            throw new RuntimeException();
        }
    }

    public double deposit(double amount) {
        return balance += amount;
    }
}