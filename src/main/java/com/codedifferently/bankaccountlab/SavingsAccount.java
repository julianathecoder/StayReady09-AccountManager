package com.codedifferently.bankaccountlab;

import jdk.vm.ci.meta.Local;

import java.time.LocalDate;
import java.util.Random;

public class SavingsAccount {

    private int acctNum; //  Allows for unique identification of each account
    private double annualFees; // Fees charged annually
    private String name; // individual name associated with an account
    private double rate; // Represents the annual return on savings
    private double balance; // the current balance of the account
    private LocalDate dateOpened; // date account was opened, so as to check when too charge annually

    public SavingsAccount(int acctNum, String name, double balance, LocalDate dateOpened){
        this.acctNum = acctNum;
        annualFees = 50.0;
        this.name = name;
        rate = 1.0;
        this.balance = balance;
        this.dateOpened = dateOpened;
    }

    public void chargeAnnualFees(){
        if (dateOpened.equals(LocalDate.now()) && balance >= annualFees){
            balance -= annualFees;
        }
    }

    public int getAcctNum(){
        return acctNum;
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }


}