package org.example;

import org.example.bank_system.SavingsAccount;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SavingsAccountTest {

    private SavingsAccount account;

    @Test
    void deposit_validAmount_success() {
        account = new SavingsAccount(123456789, 1000.0);
        account.deposit(500.0);

        assertEquals(1500.0, account.getBalance());
    }
}
