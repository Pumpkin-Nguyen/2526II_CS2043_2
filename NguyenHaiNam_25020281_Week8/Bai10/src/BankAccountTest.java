import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class BankAccountTest {
    protected static BankAccount bankAccount;

    @BeforeEach
    void init() {
        bankAccount = new BankAccount("123456789", "Nam");

        bankAccount.deposit(500);
    }

    // DEPOSIT
    @Test
    void deposit_validAmount_success() {
        int amount = 30;
        bankAccount.deposit(amount);
        assertEquals(530, bankAccount.getBalance(), 0.0);
    }

    @Test
    void deposit_amountEqual0_fail() {
        int amount = 0;
        assertThrows(IllegalArgumentException.class, () -> bankAccount.deposit(amount));
    }

    @Test
    void deposit_amountBelow0_fail() {
        int amount = -1;
        assertThrows(IllegalArgumentException.class, () -> bankAccount.deposit(amount));
    }

    // WITHDRAW
    @Test
    void withdraw_validAmount_success() {
        int amount = 200;
        assertTrue(bankAccount.withdraw(amount));
    }

    @Test
    void withdraw_greaterAmount_success() {
        int amount = 501;
        assertFalse(bankAccount.withdraw(amount));
    }

    @Test
    void withdraw_amountEqual0_fail(){
        int amount = 0;
        assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(amount));
    }

    @Test
    void withdraw_amountBelow0_fail(){
        int amount = -1;
        assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(amount));
    }

    // CUSTOM TEST
    @Test
    void customTest_success() {
        bankAccount = new BankAccount("1234", "Nam");
        assertEquals(0, bankAccount.getBalance(), 0.0);

        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance(), 0.0);

        assertTrue(bankAccount.withdraw(200));

        assertFalse(bankAccount.withdraw(400));

        assertEquals(300, bankAccount.getBalance(), 0.0);
    }
}
