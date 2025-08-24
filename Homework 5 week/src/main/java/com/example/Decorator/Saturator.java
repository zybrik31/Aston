package com.example.Decorator;

public class Saturator extends ChainOfEffects{

    public Saturator(FuncOfSound f) {
        super(f);
    }

    @Override
    public void playSound() {
        super.playSound();
        System.out.println("Добавляем сатуратор");
    }

    @Override
    public String getSoundName() {
        return super.getSoundName() + " + сатуратор";
    }


}
