package com.example;
import com.example.MyHashSet;

public class Main {
    public static void main(String[] args) {
        MyHashSet<Integer> myHashSet = new MyHashSet<>();
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);
        myHashSet.add(3);
        myHashSet.print();
        myHashSet.remove(2);
        myHashSet.remove(4);
        myHashSet.print();  //Для проверки работы

        MyHashSet<String> myHashSet2 = new MyHashSet<>();
        myHashSet2.add("Red");
        myHashSet2.add("Blue");
        myHashSet2.add("Green");
        myHashSet2.print();
        myHashSet2.remove("Red");
        myHashSet2.remove("Blue");
        myHashSet2.print();
    }
}