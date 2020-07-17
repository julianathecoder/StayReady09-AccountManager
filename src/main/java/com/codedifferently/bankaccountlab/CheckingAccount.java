package com.codedifferently.bankaccountlab;

public class CheckingAccount extends BankAccount {

    private int accountNumber;
    private double fees;
    private String name;
    private double balance;


    public CheckingAccount(int accountNumber, double fees, String name, double balance) {
        this.accountNumber = accountNumber;
        this.fees = fees;
        this.name = name;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double Accountfees) {
        this.fees = fees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double accountBalance) {
        this.balance = accountBalance;
    }

}