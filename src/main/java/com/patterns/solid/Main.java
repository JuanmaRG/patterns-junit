package com.patterns.solid;

public class Main {

    public static void main(String[] args) throws CarTypeNotFoundException {

        String carType = "electric";

        ICar car;
        if (carType.equals("Car")) {
            car = new Car();
        } else if (carType.equals("electric")) {
            car = new ElectricCar();
        }else{
            throw  new CarTypeNotFoundException("no se ha introducido un coche valido");
        }
        car.accelerate();
    }
}
