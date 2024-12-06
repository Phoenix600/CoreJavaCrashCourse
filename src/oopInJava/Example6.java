package oopInJava;

import java.util.Scanner;

class Account
{
    ///  Object Level Data-Members
    String accountNumber; // null
    String accountHolderName; // null
    String ifscCode; // null
    double balance; // 0.0
    boolean isSavingsAccount; // false

    ///  Class Level Data-Member
    static String bankName = "MAHARASHTRA-BANK";

    ///  Object Level Member Functions or Non-Static-Methods
    void displayAccountDetails()
    {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("IFSC Code : " + ifscCode);
        System.out.println("Balance : " + balance);
        System.out.println("Is Savings Account : " + isSavingsAccount);
    }

    /// Class-Level Member Function or Static Method
    static void className()
    {
        System.out.println("Account Class");
    }
}


public class Example6 {
    public static void main(String...args)
    {
       Account a1 = null;
       System.out.println("Account :" + a1);
       a1 = new Account();
       System.out.println("Account :" + a1);

        System.out.println(a1.accountHolderName); // null
        System.out.println(a1.accountNumber); // null
        System.out.println(a1.ifscCode); // null
        System.out.println(a1.isSavingsAccount); // false
        System.out.println(a1.balance); // 0.0

        a1.accountHolderName = "Pranay";
        a1.accountNumber = "1234567890";
        a1.ifscCode = "MAHB000001";
        a1.isSavingsAccount = true;
        a1.balance = 1000000.0;

        System.out.println(a1.accountHolderName); // Pranay
        System.out.println(a1.accountNumber); // 1234567890
        System.out.println(a1.ifscCode); // MAHB000001
        System.out.println(a1.isSavingsAccount); // true
        System.out.println(a1.balance); // 1000000.0

        a1.displayAccountDetails();

        System.out.println(Account.bankName);
        Account.className();

        Account a2 = new Account();
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter the account holder name : ");
        a2.accountHolderName = Input.next();

        System.out.println("Enter the account number : ");
        a2.accountNumber = Input.next();

        System.out.println("Enter the ifsc code : ");
        a2.ifscCode = Input.next();

        System.out.println("Enter the balance : ");
        a2.balance = Input.nextDouble();

        System.out.println("Enter the isSavingsAccount : ");
        a2.isSavingsAccount = Input.nextBoolean();

        a2.displayAccountDetails();


    }
}
