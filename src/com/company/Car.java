package com.company;

public class Car {
    private double speed;
    private double weight;
    private String color;
    private int length;

    public void setSpeed(double s) {
        this.speed = s;
    }

    public double getSpeed() {
        return this.speed;
    }


    Car(double s, double w, String c, int l) {
        this.speed = s;
        this.weight = w;
        this.color = c;
        this.length = l;
    }

    public void doMove() {

    }
    public void doBeep() {

    }
}
