package com.assign6strategy;

public class Vampire {
    private Strategy str;
    public Vampire(Strategy str){
        this.str = str;
    }

    public void movement(){
        str.walk();
    }
}

