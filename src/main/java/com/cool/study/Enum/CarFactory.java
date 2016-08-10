package com.cool.study.Enum;

/**
 * Created by cool on 16/8/1.
 */
public enum CarFactory {


    FordCar,BuickCar;
    public Car create(){

        switch (this){
            case FordCar:
                return new FordCar();
            case BuickCar:
                return new BuickCar();
            default:
                throw new AssertionError("无效参数");
        }
    }
}
