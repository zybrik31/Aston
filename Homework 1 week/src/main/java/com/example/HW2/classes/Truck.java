package com.example.HW2.classes;

import com.example.HW2.abstract_class.Transport;
import com.example.HW2.interfaces.Cargo;
import com.example.HW2.interfaces.Wheels;

public final class Truck extends Transport implements Wheels, Cargo {
    public Truck() {
        super();
        System.out.println("Truck is a part of transport");
    }

    @Override
    public void cargo() {
        System.out.println("Truck carries cargo");
    }

    @Override
    public void wheels() {
        System.out.println("Truck has wheels");
    }
}
