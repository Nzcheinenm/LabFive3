package com.company;

public class Transport<T extends Transport>  {
    private int speed;
    private int countGear;

    public T setSpeed(int speed)  {
        this.speed = speed;
        return (T) this;
    }

    public T setCountGear(int countGear) {
        this.countGear = countGear;
        return (T) this;
    }
}

