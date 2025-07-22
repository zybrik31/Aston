package com.example.HW2;

import com.example.HW2.abstract_class.Transport;
import com.example.HW2.classes.*;

public class Main {
    public static void main(String[] args) {

        Plain plain = new Plain();
        Transport helicopter = new Helicopter();
        Speedboat speedboat = new Speedboat();
        Transport tanker = new Tanker();
        Truck truck = new Truck();
        Transport taxi = new Taxi();

        plain.cargo();
        plain.screw();
        plain.wings();
        plain.wheels();

        ((Helicopter) helicopter).wheels();
        ((Helicopter) helicopter).screw();

        speedboat.cargo();
        speedboat.screw();

        ((Tanker)tanker).cargo();
        ((Tanker)tanker).screw();

        truck.cargo();
        truck.wheels();

        ((Taxi)taxi).wheels();

    }
}
