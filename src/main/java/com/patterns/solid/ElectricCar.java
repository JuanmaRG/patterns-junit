package com.patterns.solid;

import java.util.logging.Logger;

public class ElectricCar implements ICar{

    private int battery;
    Logger log  = Logger.getLogger("ElectricCarLog");

    @Override
    public void accelerate() {
        if (hasBattery()) {
            log.info("accelerating the car");

        } else {
            log.info("I can not accelerate the car");

        }
    }

    @Override
    public void stop() {
        log.info("accelerating the car");
    }

    public boolean hasBattery() {

        log.info("checking battery...");
        if (battery < 95) {
            log.info("the battery is very low");
            return false;
        } else {
            log.info("Batery OK");
            return true;
        }
    }
}
