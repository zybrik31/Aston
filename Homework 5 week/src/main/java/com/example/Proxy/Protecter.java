package com.example.Proxy;

public class Protecter implements ShowData{
    private Data data;
    private String name;
    private boolean needToShow;
    private int valueOfData;

    public Protecter(String name, int valueOfData, boolean needToShow) {
        this.name = name;
        this.valueOfData = valueOfData;
        this.needToShow = needToShow;
        data = new Data(this.name, this.valueOfData);
    }

    public void getData() {
        if (this.needToShow) {
            System.out.println("Доступ разрешен:" + " " + this.name);
            return;
        }
        System.out.println("Доступ запрещен!");
    }
}
