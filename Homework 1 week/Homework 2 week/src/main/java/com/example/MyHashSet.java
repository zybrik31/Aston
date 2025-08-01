package com.example;

import java.util.HashMap;
import java.util.Map;

public class MyHashSet<E> {
    private static final Object fake = new Object();
    private final Map<E, Object> fake_map;

    public MyHashSet() {
        this.fake_map = new HashMap<>();
    }

    public boolean add(E element) {
        if (fake_map.containsKey(element)) {
            return false;
        } else {
            fake_map.put(element, fake);
            return true;
        }
    }

    public void remove(E element) {
            fake_map.remove(element);
    }

    public void print(){        //Для проверки работы
        for (E element : fake_map.keySet()) {
            System.out.println(element);
        }
    }
}
