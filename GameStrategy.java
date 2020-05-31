package com.assign6strategy;

public class GameStrategy implements Strategy {
    public void walk(){
        System.out.println("I can walk");
    }

    public void fly() {
        System.out.println("I can fly");
    }


    public void both() {
        System.out.println("I can both fly and walk");

    }


    public void magic() {
        System.out.println("I fly with help of magic");
    }

}
