package com.patterns.solid;


import java.util.logging.Logger;

public class Car implements ICar{

    Logger log  = Logger.getLogger("CarLog");

    @Override
    public void accelerate() {
        log.info("accelerating the car");

    }

    @Override
    public void stop() {
        log.info("stopping the car");

    }
}
