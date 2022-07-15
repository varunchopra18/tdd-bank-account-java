package org.xpdojo.bank;

public class Account {

    private int balance = 0;
    public void deposite(int amount) {
        balance=balance+amount;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) throws Exception {
        if(balance-amount >= 0){
            balance = balance-amount;
        }
        else{
            throw new Exception("Not Enough Balance!!");
        }
    }
}
