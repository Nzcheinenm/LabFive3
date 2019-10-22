package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Vaz vaz = new Vaz();
    vaz
            .setSpeed(80)
            .setCountGear(4)
            .setPrice(10000)
            .setSafety(1);

    Transport car = new Transport();
    car
            .setCountGear(4)
            .setSpeed(80);


    }
}

