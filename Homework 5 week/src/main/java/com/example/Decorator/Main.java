package com.example.Decorator;

public class Main {
    public static void main(String[] args) {
        FuncOfSound sound = new BaseSound("Бас");
        sound.getSoundName();
        sound.playSound();

        FuncOfSound fat = new Saturator(sound);
        fat.getSoundName();
        fat.playSound();

        FuncOfSound comp = new Compressor(fat);
        comp.getSoundName();
        comp.playSound();

        FuncOfSound eq = new EQ(comp);
        eq.getSoundName();
        eq.playSound();

        FuncOfSound eqWithoutComp = new EQ(fat);
        eqWithoutComp.getSoundName();
        eqWithoutComp.playSound();
    }
}
