package org.xpdojo.bank;


import org.hamcrest.core.Is;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matcher.*;


public class AccountTest {


    @Test
    public void testSomething(){
        Account account = new Account();
        account.deposite(100);
        assertThat(100, Is.is(account.getBalance()));
    }
}
