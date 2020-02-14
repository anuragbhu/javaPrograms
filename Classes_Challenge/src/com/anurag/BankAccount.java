package com.anurag;

public class BankAccount {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount() {
        this(12345, 0, "No Name", "noname@gmail.com", 123);
        System.out.println("Empty constructor called");
    }

    public BankAccount(int accountNumber, int balance, String customerName, String email, int phoneNumber) {
        System.out.println("Constructor with parameter called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

//    public void setAccountNumber (int accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    public void setBalance(int balance) {
//        this.balance = balance;
//    }
//
//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setPhoneNumber(int phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }

    public int getAccountNumber () {
        return this.accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void deposit (int deposit) {
        this.balance += deposit;
        System.out.println("Available balance in account is = " + this.balance);
    }

    public void withdraw (int withdraw) {
        if (this.balance >= withdraw) {
            this.balance -= withdraw;
            System.out.println("Available balance in account is = " + this.balance);
        } else
            System.out.println("Insufficient amount");

    }
}
