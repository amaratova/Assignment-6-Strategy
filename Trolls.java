package com.assign6strategy;

public class Trolls {
    private Strategy str;
    public Trolls(Strategy str){
        this.str = str;
    }

    public void movement(){
        str.walk();
    }
}
