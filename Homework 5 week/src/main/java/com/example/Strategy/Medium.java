package com.example.Strategy;

public class Medium implements ChooseStrategy{
    @Override
    public void chooseStrategy(int cost, boolean efficiency) {
        if (efficiency) {
            System.out.println("Топ за свои деньги: " + cost);
            return;
        }
        System.out.println("Ну а чего ты хотел за эти деньги: " + cost);
    }
}
