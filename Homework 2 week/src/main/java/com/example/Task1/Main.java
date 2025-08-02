package com.example.Task1;

import java.util.HashSet;
import java.util.Set;

public class Main {

    //МЕТОДЫ print() ДЛЯ ПРОВЕРКИ

    public static void main(String[] args) {
        MyHashSet<String> myHashSet = new MyHashSet<>();
        myHashSet.add("Red");
        myHashSet.add("Blue");
        myHashSet.add("Green");
        myHashSet.add("Green");
        myHashSet.print();
        myHashSet.remove("Red");
        myHashSet.remove("Blue");
        myHashSet.remove("Yellow");
        myHashSet.print();

        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("Red");
        myArrayList.add("Blue");
        myArrayList.add("Green");
        myArrayList.add("Green");
        myArrayList.add("Yellow");
        myArrayList.print();
        myArrayList.remove(2);
        myArrayList.remove(2);
        System.out.println(myArrayList.get(0));
        System.out.println(myArrayList.get(1));
        System.out.println(myArrayList.get(2));
        System.out.println(myArrayList.get(3));
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");
        myArrayList.addAll(set);
        myArrayList.print();

        MyArrayList<String> myArrayList2 = new MyArrayList<>(3);
        myArrayList2.add("1");
        myArrayList2.add("2");
        myArrayList2.add("3");
        myArrayList2.add("4");
        myArrayList2.print();
        myArrayList2.addAll(set);
        myArrayList2.print();

        MyArrayList<String> myArrayList3 = new MyArrayList<>(6, "Object");
        myArrayList3.print();
        myArrayList3.addAll(set);
        myArrayList3.print();
    }
}