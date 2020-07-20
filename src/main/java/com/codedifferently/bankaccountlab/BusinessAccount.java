package com.codedifferently.bankaccountlab;


public class BusinessAccount extends BankAccount {

    private String businessName;
    private Integer taxId;

    public BusinessAccount(String businessName, Double initialBalance, Integer taxId){
        super(initialBalance);
        this.accountFee = 50.00;
        this.businessName = businessName;
        this.accountBalance = initialBalance;
        this.taxId = taxId;
    }

    public String getBusinessName(){
        return this.businessName;
    }

    public void setBusinessName(String businessName){
        this.businessName = businessName;
    }

    public Integer getTaxId(){
        return this.taxId;
    }

    @Override
    public Integer getAccountNumber(){
        return this.accountNumber;
    }

    @Override
    public Double getAccountBalance(){
        return this.accountBalance;
    }

    @Override
    public Double getAccountFee(){
        return this.accountFee;
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