package com.patterns.solid;

import org.junit.platform.commons.logging.LoggerFactory;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Car implements ICar{

    

    @Override
    public void accelerate() {

        System.out.println("accelerating the car");
    }

    @Override
    public void stop() {
        System.out.println("stopping the car");
    }
}
