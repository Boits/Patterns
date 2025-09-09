package org.example.g3_behavioral.p2_State.state;

import lombok.RequiredArgsConstructor;
import org.example.g3_behavioral.p2_State.BankAccount;

@RequiredArgsConstructor
public class ActiveState implements AccountState {

    private final BankAccount account;

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposited " + amount + ". New balance: " + account.getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Withdrew " + amount + ". New balance: " + account.getBalance());
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

