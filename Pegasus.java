package com.assign6strategy;

public class Pegasus {
    private Strategy str;
    public Pegasus(Strategy str){
        this.str = str;
    }

    public void movement(){
        str.both();
    }
}
