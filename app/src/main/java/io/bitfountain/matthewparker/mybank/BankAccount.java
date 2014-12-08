package io.bitfountain.matthewparker.mybank;

import android.util.Log;

/**
 * Created by matthewparker on 12/7/14.
 */
public class BankAccount {
    private static final String TAG = "BankAccount";
    private double mBalance;
    public static final double OVERDRAFT_FEE = 30;

    public void withdraw(double amount){
        mBalance -= amount;

        if(mBalance < 0){
            mBalance -= OVERDRAFT_FEE;
        }
    }

    public void deposit(double amount){
        mBalance += amount;
    }

    public double getBalance(){
        return mBalance;
    }
}
