package org.xpdojo.bank;


import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;


public class AccountTest {

    @Test
    public void initializeAccountWithZeroBalance(){
        Account account = new Account();
        assertThat(0,Is.is(account.getBalance()));
    }

    @Test
    public void depositMoney(){
        Account account = new Account();
        account.deposit(100);
        assertThat(100, Is.is(account.getBalance()));
    }

    @Test
    public void depositMoneyTwice(){
        Account account = new Account();
        account.deposit(100);
        account.deposit(50);
        assertThat(150, Is.is(account.getBalance()));
    }

    @Test
    public void depositAndWithDrawMoney() throws Exception {
        Account account = new Account();
        account.deposit(100);
        account.deposit(50);
        account.withdraw(50);
        assertThat(100, Is.is(account.getBalance()));
    }

    @Test
    public void withdrawMoreMoneyThanBalance(){
        Account account = new Account();
        account.deposit(100);
        try{
            account.withdraw(50);
            account.withdraw(50);
            account.withdraw(50);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            assertThat(0, Is.is(account.getBalance()));
        }


    }


}
