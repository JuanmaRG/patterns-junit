package com.patterns;

public class Calculator {

    /**
     * It multiplies two numbers
     * @param num1 numero 1
     * @param num2 numero 2
     * @return devuelve el resultado de numero1 * numero2
     */
    public double multiply(double num1, double num2){
        // multiply two doubles
        return num1 * num2;
    }

    public double add(double num1, double num2){
        return (num1 + num2);
    }

    public double subtract(double num1, double num2){
        return (num1 - num2);
    }
}
