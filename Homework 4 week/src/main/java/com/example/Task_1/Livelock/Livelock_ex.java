package com.example.Task_1.Livelock;

public class Livelock_ex {

    public String name;
    private String way;
    public boolean locked = true;

    public Livelock_ex(String name, String rightWay) {
        this.name = name;
        this.way = rightWay;
    }

    public String getWay() {
        return way;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}
