package com.money;

public class Money {
    private static Object currency;

    public static void main(String[] args) {
        System.out.println("Hello World");
        getCurrency();
    }

    public static Object getCurrency() {
        return currency;
    }
}
