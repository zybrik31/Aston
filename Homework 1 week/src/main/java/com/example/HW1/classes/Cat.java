package com.example.HW1.classes;

import com.example.HW1.interfaces.Fur;
import com.example.HW1.interfaces.Spine;

public final class Cat extends Mammal implements Fur, Spine {
    public Cat() {
        System.out.println("Cat is a mammal");
    }

    @Override
    public void fur() {
        System.out.println("Furry cat");
    }

    @Override
    public void spine() {
        System.out.println("Cat has a spine");
    }
}
