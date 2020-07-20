package com.codedifferently.bankaccountlab;

public class SavingsAccount extends BankAccount {

    private String accountOwner;

    public SavingsAccount(String accountOwner, Double initialBalance) {
        super(initialBalance);
        this.accountOwner = accountOwner;
        this.accountFee = 10.00;
        this.accountBalance = initialBalance;
    }

    public String getAccountOwner(){
        return this.accountOwner;
    }

    public void setName(String accountOwner){
        this.accountOwner = accountOwner;
    }

    public Integer getAccountNumber() {
        return this.accountNumber;
    }

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