package com.money;

public class Money {
    public static void setCurrency(Object currency) {
        Money.currency = currency;
    }

    private static Object currency;

    public static void main(String[] args) {
        System.out.println("Hello Wsdforld");
        System.out.println("Hello World");
        getCurrency();
    }

    public static Object getCurrency() {
        return currency;
    }
}
