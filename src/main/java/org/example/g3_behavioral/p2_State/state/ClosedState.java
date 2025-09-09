package org.example.g3_behavioral.p2_State.state;

import lombok.RequiredArgsConstructor;
import org.example.g3_behavioral.p2_State.BankAccount;

@RequiredArgsConstructor
public class ClosedState implements AccountState {

    private final BankAccount account;

    @Override
    public void deposit(double amount) {
        System.out.println("Account is closed. Cannot deposit funds.");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Account is closed. Cannot withdraw funds.");
    }
}

