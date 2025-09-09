package org.example.g3_behavioral.p2_State;

import org.example.g3_behavioral.p2_State.state.AccountState;
import org.example.g3_behavioral.p2_State.state.ActiveState;
import org.example.g3_behavioral.p2_State.state.BlockedState;
import org.example.g3_behavioral.p2_State.state.ClosedState;

/**
 * В этом классе просходит изменение состояния.
 * И вызов методов состояния.
 */
public class BankAccount {
    private AccountState state;
    private double balance;

    public BankAccount() {
        state = new ActiveState(this); // Начальное состояние — активный счет
        balance = 0;
    }

    public void setState(AccountState newState) {
        this.state = newState;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Действия для клиентов
     */
    public void deposit(double amount) {
        state.deposit(amount);
    }

    public void withdraw(double amount) {
        state.withdraw(amount);

        if (balance < -100) {
            blockAccount();
        }
    }

    public void closeAccount() {
        setState(new ClosedState(this));
        System.out.println("Account is closed.");
    }

    public void blockAccount() {
        setState(new BlockedState(this));
        System.out.println("Account is blocked.");
    }
}

