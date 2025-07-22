package com.example.HW2.classes;

import com.example.HW2.abstract_class.Transport;
import com.example.HW2.interfaces.Screw;
import com.example.HW2.interfaces.Wheels;

public final class Helicopter extends Transport implements Screw, Wheels {
    public Helicopter() {
        super();
        System.out.println("Helicopter is a part of transport");
    }

    @Override
    public void screw(){
        System.out.println("Helicopter has a screw");
    }

    @Override
    public void wheels() {
        System.out.println("Helicopter has wheels");
    }
}
