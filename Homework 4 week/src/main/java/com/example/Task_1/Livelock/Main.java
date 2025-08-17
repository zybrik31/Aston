package com.example.Task_1.Livelock;

public class Main {

    public static void main(String[] args) {
        Livelock_ex per1 = new Livelock_ex("Человек 1", "идет вправо");
        Livelock_ex per2 = new Livelock_ex("Человек 2", "идет влево");

        new Thread(() -> {
            while (per1.isLocked()){
                if (per2.getWay().equals("идет вправо")){
                    System.out.println(per1.name + " разошелся по разные стороны с " + per2.name);
                    per1.setLocked(false);
                    continue;
                }
                System.out.println(per1.name + " " + per1.getWay() + " и сталкивается с " + per2.name);
            }
        }).start();

        new Thread(() -> {
            while (per2.isLocked()){
                if (per1.getWay().equals("идет влево")){
                    System.out.println(per2.name + " разошелся по разные стороны с " + per1.name);
                    per2.setLocked(false);
                    continue;
                }
                System.out.println(per2.name + " " + per2.getWay() + " и сталкивается с " + per1.name);
            }
        }).start();
    }
}
