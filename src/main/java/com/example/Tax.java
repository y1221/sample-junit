package com.example;

public class Tax {
    private static final double TAX_RATE = 0.1;

    public int taxIn(int price) {
        return (int) (price * (1 + TAX_RATE));
    }
}
