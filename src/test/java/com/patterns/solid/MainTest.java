package com.patterns.solid;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

   @Test
   @DisplayName("Chequear que se crea un coche electrico")
   void CheckElectricCar() {

    ICar coche = new ElectricCar();

    assertTrue(coche instanceof  ElectricCar);

   }



}