package com.example.Proxy;

public class Data implements ShowData {
    public String name;
    public int data;

    public Data(String name, int data) {
        this.name = name;
        this.data = data;
    }

    public void getData(){
        System.out.println(this.data);
    }
}
