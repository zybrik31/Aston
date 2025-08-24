package com.example.Chain;

public class Main {
    public static void main(String[] args) {
        Bot bot = new Bot();
        Manager manager = new Manager();
        Boss boss = new Boss();
        CEO ceo = new CEO();

        bot.next(manager);
        manager.next(boss);
        boss.next(ceo);

        for (int i = 1; i < 6; i++){
            bot.convWith(i);
        }
    }
}
