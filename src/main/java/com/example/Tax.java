package com.example;

public class Tax {
    // 消費税率
    private final double TAX_RATE = 0.1;

    public int taxIn(int price) {
        return (int) (price * (1 + TAX_RATE));
    }
}
