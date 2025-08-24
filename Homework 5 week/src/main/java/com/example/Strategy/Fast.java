package com.example.Strategy;

public class Fast implements ChooseStrategy {
    @Override
    public void chooseStrategy(int cost, boolean efficiency) {
        System.out.print("Очень производительный. ");
        System.out.println("Очень дорогой: " + cost);
    }
}
