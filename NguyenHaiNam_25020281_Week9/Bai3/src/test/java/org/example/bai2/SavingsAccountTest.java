package org.example.bai2;

import org.example.bai2.bank_system.SavingsAccount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SavingsAccountTest {

    private final SavingsAccount account = new SavingsAccount(123456789, 1000.0);

    @Test
    void deposit_validAmount_success() {
        account.deposit(500.0);

        assertEquals(1400.0, account.getBalance());
    }
}
