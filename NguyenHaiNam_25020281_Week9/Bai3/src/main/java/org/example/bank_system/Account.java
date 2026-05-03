package org.example.bai2.bank_system;

import java.io.*;
import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Tai khoan ngan hang
 */
public abstract class Account {

  private static final Logger logger = LoggerFactory.getLogger(Account.class);

  public static final String CHECKING_TYPE = "CHECKING";
  public static final String SAVINGS_TYPE = "SAVINGS";

  private long accountNumber;
  private double balance;
  protected List<Transaction> transactionList;

  public Account(long accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.transactionList = new ArrayList<Transaction>();
  }

  public long getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(long accountNumber) {
    this.accountNumber = accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  protected void setBalance(double balance) {
    this.balance = balance;
  }

  public List<Transaction> getTransactionList() {
    return transactionList;
  }

  public void setTransactionList(List<Transaction> transactionList) {
    if (transactionList == null) {
      this.transactionList = new ArrayList<Transaction>();
    } else {
      this.transactionList = transactionList;
    }
  }

  /**
   * Rut tien
   */
  public abstract void deposit(double amount);

  public abstract void withdraw(double amount);

  protected void doDepositing(double amount) throws InvalidFundingAmountException {
    if (amount <= 0) {
      throw new InvalidFundingAmountException(amount);
    }
    balance += amount;
  }

  protected void doWithdrawing(double amount) throws Exception {
    if (amount <= 0) throw new InvalidFundingAmountException(amount);
    if (amount > balance) throw new InsufficientFundsException(amount);
    balance -= amount;
  }

  public void addTransaction(Transaction transaction) {
    if (transaction != null) {
      transactionList.add(transaction);
    }
  }

  public String getTransactionHistory() {
    StringBuilder historyBuilder = new StringBuilder();
    historyBuilder.append("Lịch sử giao dịch của tài khoản ").append(accountNumber).append(":\n");

    for (int i = 0; i < transactionList.size(); i++) {
      historyBuilder.append(transactionList.get(i).getTransactionSummary());
      if (i < transactionList.size() - 1) {
        historyBuilder.append("\n");
      }
    }

    logger.debug("Đã lấy lịch sử cho tài khoản: {}", accountNumber);
    return historyBuilder.toString();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Account)) return false;
    Account other = (Account) obj;
    return this.accountNumber == other.accountNumber;
  }

  @Override
  public int hashCode() {
    return Long.hashCode(accountNumber);
  }
}
