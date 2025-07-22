package com.example.HW1;

import com.example.HW1.abstract_classes.Animal;
import com.example.HW1.classes.Fish;
import com.example.HW1.classes.Mammal;
import com.example.HW1.classes.Bear;
import com.example.HW1.classes.Cat;
import com.example.HW1.classes.Whale;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Mammal bear = new Bear();
        Animal whale = new Whale();
        Fish fish = new Fish();
        Mammal someMammal = new Mammal();

        cat.fur();
        cat.spine();
        ((Bear) bear).fur();
        bear.spine();
        ((Whale) whale).water();
        ((Whale) whale).spine();
        fish.water();
        someMammal.spine();
    }
}