package com.codedifferently.bankaccountlab;

import java.util.*;

public class MainApplication {

    private static void main(String... args) {

        HashMap<Integer,BankAccount> accounts=new HashMap<Integer, BankAccount>();
        Scanner scnr = new Scanner(System.in);

    }

    public static void menu(){
        System.out.println("Welcome to Stay Ready Bank.");
        System.out.println("What do you want to do? Enter a number");
        System.out.println("1) Create Checkings Account");
        System.out.println("2) Create Savings Account");
        System.out.println("3) Create Business Account");
        System.out.println("4) Checks account(s)");
        System.out.println("5) Exit");
    }

    static void accountMenu(){
        System.out.println("What do you want to do? Enter a number");
        System.out.println("1) Deposit");
        System.out.println("2) Withdraw");
        System.out.println("3) Close account");
        System.out.println("4) Exit");
    }

    public static void createSavingsAccount(){

    }

    public static void createCheckingAccount(){

    }

    public static void createBusinessAccount(){

    }

    public static void checAllAccounts(){

    }
}
