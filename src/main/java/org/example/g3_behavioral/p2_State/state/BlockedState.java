package org.example.g3_behavioral.p2_State.state;

import lombok.RequiredArgsConstructor;
import org.example.g3_behavioral.p2_State.BankAccount;

@RequiredArgsConstructor
public class BlockedState implements AccountState {

    private final BankAccount account;

    @Override
    public void deposit(double amount) {
        System.out.println("Account is blocked. Cannot deposit funds.");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Account is blocked. Cannot withdraw funds.");
    }
}

