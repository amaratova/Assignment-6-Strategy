package com.assign6strategy;

public class Orcs{
    private Strategy str;
    public Orcs(Strategy str){
        this.str = str;
    }

    public void movement(){
        str.walk();
    }
}
