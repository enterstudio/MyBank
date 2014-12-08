package io.bitfountain.matthewparker.mybank;

/**
 * Created by matthewparker on 12/7/14.
 */
public class BankAccount {
    private double balance;
    public static final double overdraftFee = 30;

    public void withdraw(double amount){
        balance -= amount;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public double getBalance(){
        return balance;
    }
}
