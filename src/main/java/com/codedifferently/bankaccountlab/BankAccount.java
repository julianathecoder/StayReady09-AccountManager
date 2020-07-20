package com.codedifferently.bankaccountlab;

public abstract class BankAccount {
    protected Integer accountNumber;
    protected Double accountFee;
    protected Double accountBalance;
    protected String accountName;

    public BankAccount(Double initialBalance){
        this.accountBalance = initialBalance;
    }

    public abstract Integer getAccountNumber();

    public abstract Double getAccountFee();

    public abstract Double getAccountBalance();

    public abstract void depositMoney(Double amount);

    public abstract void withdrawMoney(Double amount);

}
