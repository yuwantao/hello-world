package com.money;

public class Money {
    private static Object currency;

    public static void main(String[] args) {
        System.out.println("Hello World");
//        getCurrency();
    }

    public static void setCurrency(Object currency) {
        Money.currency = currency;
    }
}
