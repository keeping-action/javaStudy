package com.cool.study.Enum;

/**
 * Created by cool on 16/8/1.
 */
public class CarFactoryMain {

    public static void main(String[] args) {
        Car car=CarFactory.BuickCar.create();
        System.out.println(car);
    }
}

