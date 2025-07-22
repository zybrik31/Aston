package com.example.HW1.classes;

import com.example.HW1.abstract_classes.Animal;
import com.example.HW1.interfaces.Spine;

public class Mammal extends Animal implements Spine {
    public Mammal() {
        super();
        System.out.println("Mammal is an animal");
    }

    @Override
    public void spine() {
        System.out.println("Mammal is spinning");
    }
}
