package io.bitfountain.matthewparker.mybank;

import android.util.Log;

/**
 * Created by matthewparker on 12/9/14.
 */
public class SavingsAccount extends BankAccount{
    private static final String TAG = "SavingsAccount";
    @Override
    public void withdraw(double amount) {
       if(numberOfWithdrawals() >= 3){
           return;
       }
       super.withdraw(amount);
    }
}
