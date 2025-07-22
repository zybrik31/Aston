package com.example.HW2.classes;

import com.example.HW2.abstract_class.Transport;
import com.example.HW2.interfaces.Cargo;
import com.example.HW2.interfaces.Screw;

public final class Speedboat extends Transport implements Screw, Cargo {
    public Speedboat() {
        super();
        System.out.println("Speedboat is a part of transport");
    }

    @Override
    public void cargo() {
        System.out.println("Speedboat carries cargo");
    }

    @Override
    public void screw() {
        System.out.println("Speedboat has a screw");
    }
}
