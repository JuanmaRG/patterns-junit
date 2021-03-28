package com.patterns.behavioral.strategy.strategy1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopCartTest {

    ShopCart trolley = new ShopCart();



    @Test
    @DisplayName("Testear que se insertan Productos")
    void checkAddProduct() {
        Product productoTest = new Product("1234",2D);
        trolley.addProduct(productoTest);
        assertTrue(trolley.checkProductList());

    }


}