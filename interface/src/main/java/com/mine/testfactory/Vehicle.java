package com.mine.testfactory;

import java.io.Serializable;

/**
 * 载具基础类
 *
 * @author chenh
 * @version 0.1
 * @date 2019/05/28
 */
public abstract class Vehicle implements Serializable {

    private int wheels;
    private int doors;

    public Vehicle(){
    }

    public Vehicle(int wheels, int doors){
        this.wheels = wheels;
        this.doors = doors;
    }

    /**
     * 载具信息
     *
     * @params []
     * @return void
     * @author chenh
     * @date 2019/5/28 11:20
     */
    public abstract void sayHello();

    public void setWheels(int num){
        this.wheels = num;
    }

    public void setDoors(int num){
        this.doors = num;
    }

    public int getWheels(){
        return wheels;
    }

    public int getDoors(){
        return doors;
    }
}
