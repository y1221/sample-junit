package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class TaxTest {
    private Tax tax;

    @BeforeEach
    void setUp() {
        tax = new Tax();
    }

    @Test
    void testTaxIn() {
        assertEquals(1100, tax.taxIn(1000));
    }
}
