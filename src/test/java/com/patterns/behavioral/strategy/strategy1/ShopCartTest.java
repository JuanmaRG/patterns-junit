package com.patterns.behavioral.strategy.strategy1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopCartTest {


    ShopCart trolley = new ShopCart();


    @Test
    @DisplayName("Testear que la lista esta vacia")
    public void checkIsEmpty() {
        assertTrue(trolley.getProducts().isEmpty());

    }
}