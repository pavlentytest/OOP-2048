package com.company;

public class Main {

    public static void main(String[] args) {
        // bmw - объект класса Car
        Car a = new Car(100,2000, "Red",4);
      //  System.out.println(a.speed);
        a.setSpeed(900);
        System.out.println(a.getSpeed());
        // opel - объект класса Opel
        Car opel = new Car(200, 3000, "Blue", 5);
        System.out.println(opel.getSpeed());

        Car toyota = new Car();
        toyota.doMove();
        Transport bus = new Transport();
        bus.doMove();


    }
}
