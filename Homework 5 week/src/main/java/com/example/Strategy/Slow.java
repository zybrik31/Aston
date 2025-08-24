package com.example.Strategy;

public class Slow implements ChooseStrategy{
    @Override
    public void chooseStrategy(int cost, boolean efficiency) {
        System.out.println("Чисто звонилка, но зато цена: " + cost);
    }
}
