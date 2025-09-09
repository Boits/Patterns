package org.example.g3_behavioral.p2_State;

public class StateApp {

    public static void call() {
        BankAccount account = new BankAccount();

        account.deposit(1000);  // Deposited 1000. New balance: 1000.0
        account.withdraw(500);  // Withdrew 500. New balance: 500.0

        // Блокировка счета
        account.blockAccount();        // Account is blocked.
        account.deposit(200);   // Account is blocked. Cannot deposit funds.
        account.withdraw(100);  // Account is blocked. Cannot withdraw funds.

        // Закрытие счета
        account.closeAccount();        // Account is closed.
        account.deposit(100);   // Account is closed. Cannot deposit funds.
    }
}
