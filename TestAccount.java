package com.encap;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("jack");
        account.setBalance(1234);
        account.setPassword("123678");

        account.show();

    }
}
