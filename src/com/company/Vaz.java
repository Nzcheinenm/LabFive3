package com.company;

public class Vaz extends Transport<Vaz> {
    public int price;
    public int safety;

     Vaz setPrice(int price) {
        this.price = price;
        return this;
    }
    Vaz setSafety(int safety) {
        this.safety = safety;
        return this;
    }

}

