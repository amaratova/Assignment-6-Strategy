package com.assign6strategy;

public class Nymph {
    private Strategy str;
    public Nymph(Strategy str){
        this.str = str;
    }

    public void movement(){
        str.fly();
    }
}
