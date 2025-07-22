package com.example.HW2.classes;

import com.example.HW2.abstract_class.Transport;
import com.example.HW2.interfaces.Wheels;

public final class Taxi extends Transport implements Wheels {
    public Taxi() {
        super();
        System.out.println("Taxi is a part of transport");
    }

    @Override
    public void wheels() {
        System.out.println("Taxi has wheels");
    }
}
