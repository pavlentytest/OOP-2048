package com.company;

public class Car extends Transport{
    private double speed;
    private double weight;
    private String color = "Black";
    private int length;

    public void setSpeed(double s) {
        this.speed = s;
    }

    public double getSpeed() {
        return this.speed;
    }

    public void doMove() { // <- сигнатура
        System.out.println("Car is moving....");
    }

    // метод Car (конструктор) - перегружен
    Car(int d, int t) {


    }

    Car(double s, double w, String c, int l) {
        this.speed = s;
        this.weight = w;
        this.color = c;
        this.length = l;
    }

    // переопределение override

    // перегрузка overload - метод doBeep перегружен

    public void doBeep() {
        System.out.println("Beep!");
    }
    public void doBeep(String s) {
        System.out.println(s);
    }
}
