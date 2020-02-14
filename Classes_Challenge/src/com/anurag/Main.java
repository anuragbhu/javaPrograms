package com.anurag;

public class Main {

    public static void main(String[] args) {

        BankAccount anurag = new BankAccount();

//        BankAccount anurag = new BankAccount(5555, 1000, "Anurag Pandey", "anurag.bhumca18@gmail.com", 222);

//        anurag.setAccountNumber(12345);
//        anurag.setBalance(1000);
//        anurag.setCustomerName("Anurag Pandey");
//        anurag.setEmail("anurag.bhumca18@gmail.com");
//        anurag.setPhoneNumber(2202180);

        System.out.println("Account Number = " + anurag.getAccountNumber());
        System.out.println("Balace = " + anurag.getBalance());
        System.out.println("Customer name = " + anurag.getCustomerName());
        System.out.println("Email = " + anurag.getEmail());
        System.out.println("Phone Number = " + anurag.getPhoneNumber());

        anurag.deposit(3000);
        anurag.withdraw(40000);
    }
}
