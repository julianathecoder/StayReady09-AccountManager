package com.codedifferently.bankaccountlab;

public class CheckingAccount extends BankAccount {

    private String accountOwner;

    public CheckingAccount(String accountOwner , Double initialBalance) {
        super(initialBalance);
        this.accountFee = 24.00;
        this.accountOwner = accountOwner;
        this.accountBalance = initialBalance;
    }

    public String getAccountOwner(){
        return this.accountOwner;
    }

    public void setAccountOwner(String accountOwner){
        this.accountOwner = accountOwner;
    }

    @Override
    public Integer getAccountNumber() {
        return this.accountNumber;
    }

    @Override
    public Double getAccountFee() {
        return this.accountFee;
    }

    @Override
    public Double getAccountBalance(){
        return this.accountBalance;
    }

    @Override
    public void depositMoney(Double amount){
        this.accountBalance += amount;
    }

    @Override
    public void withdrawMoney(Double amount) {
        this.accountBalance -= amount;
    }
} 