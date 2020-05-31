package com.assign6strategy;

public class Elves {
    private Strategy str;
    public Elves(Strategy str){
        this.str = str;
    }

    public void movement(){
        str.magic();
    }
}
