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
}
