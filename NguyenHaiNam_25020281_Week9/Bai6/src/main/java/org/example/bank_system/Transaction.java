package org.example.bank_system;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Đại diện cho một giao dịch trong hệ thống ngân hàng.
 */
public class Transaction {

    private static final Logger logger = LoggerFactory.getLogger(Transaction.class);

    public static final int TYPE_DEPOSIT_CHECKING = 1;
    public static final int TYPE_WITHDRAW_CHECKING = 2;
    public static final int TYPE_DEPOSIT_SAVINGS = 3;
    public static final int TYPE_WITHDRAW_SAVINGS = 4;

    private int type;
    private double amount;
    private double initialBalance;
    private double finalBalance;

    public Transaction(int type, double amount, double initialBalance, double finalBalance) {
        this.type = type;
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public double getFinalBalance() {
        return finalBalance;
    }

    public void setFinalBalance(double finalBalance) {
        this.finalBalance = finalBalance;
    }

    /**
     * Trả về chuỗi mô tả dạng văn bản của loại giao dịch.
     *
     * @param type Mã loại giao dịch.
     * @return Tên loại giao dịch bằng tiếng Việt.
     */
    public static String getTypeString(int type) {
        return switch (type) {
            case TYPE_DEPOSIT_CHECKING -> "Nạp tiền vãng lai";
            case TYPE_WITHDRAW_CHECKING -> "Rút tiền vãng lai";
            case TYPE_DEPOSIT_SAVINGS -> "Nạp tiền tiết kiệm";
            case TYPE_WITHDRAW_SAVINGS -> "Rút tiền tiết kiệm";
            default -> "Không rõ";
        };
    }

    /**
     * Trả về tóm tắt thông tin của giao dịch này.
     *
     * @return Chuỗi chứa loại giao dịch, số dư ban đầu, số tiền và số dư cuối.
     */
    public String getTransactionSummary() {
        logger.debug("Bắt đầu xử lý chuỗi summary cho giao dịch loại: {}", this.type);

        return String.format(
                Locale.US,
                "- Kiểu giao dịch: %s. Số dư ban đầu: $%.2f. Số tiền: $%.2f. Số dư cuối: $%.2f.",
                getTypeString(type),
                initialBalance,
                amount,
                finalBalance);
    }
}
