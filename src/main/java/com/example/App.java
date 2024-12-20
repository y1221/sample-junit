package com.example;

public class App {
    public static void main(String[] args) {
        Tax ctax = new Tax();
        int price = ctax.taxIn(1000);
        System.out.println(price);
    }
}
