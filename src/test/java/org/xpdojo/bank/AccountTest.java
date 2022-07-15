package org.xpdojo.bank;


import org.hamcrest.core.Is;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matcher.*;


public class AccountTest {

    @Test
    public void initializeAccountWithZeroBalance(){
        Account account = new Account();
        assertThat(0,Is.is(account.getBalance()));
    }

    @Test
    public void testSomething(){
        Account account = new Account();
        account.deposite(100);
        assertThat(100, Is.is(account.getBalance()));
    }

    @Test
    public void deplositeMoneyTwice(){
        Account account = new Account();
        account.deposite(100);
        account.deposite(50);
        assertThat(150, Is.is(account.getBalance()));
    }

    @Test
    public void depositAndWithDrawMoney() throws Exception {
        Account account = new Account();
        account.deposite(100);
        account.deposite(50);
        account.withdraw(50);
        assertThat(100, Is.is(account.getBalance()));
    }

    @Test
    public void withdrawMoreMoneyThanBalance(){
        Account account = new Account();
        account.deposite(100);
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
