package com.basicspring.ioc;

public class Mobile {
    public static void main(String[] args) {
//       //Using airtel inside mobile
//        Airtel airtel = new Airtel();
//        airtel.calling();
//        airtel.data();

        //Using jio inside mobile
        Jio jio = new Jio();
        jio.calling();
        jio.data();

    }
}
