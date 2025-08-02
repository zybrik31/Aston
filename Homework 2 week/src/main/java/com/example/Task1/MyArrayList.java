package com.example.Task1;

import java.util.Arrays;
import java.util.Collection;

public class MyArrayList<E> {
    private static final int defaultCapacity = 16;
    private Object[] array;
    private int countOfElements;

    public MyArrayList() {
        this.array = new Object[defaultCapacity];
        this.countOfElements = 0;
    }

    public MyArrayList(int capacity) {
        this.array = new Object[capacity];
        this.countOfElements = 0;
    }

    public MyArrayList(int capacity, E element) {
        this.array = new Object[capacity];
        this.countOfElements = capacity;
        Arrays.fill(this.array, element);
    }

    public void add(E element) {
        if (countOfElements == array.length) {
            Object[] newArray = new Object[defaultCapacity << 1];
            System.arraycopy(array, 0, newArray, 0, countOfElements);
            array = newArray;
        }
        array[countOfElements++] = element;
    }

    public Object get(int index) {
        if (index < 0 || index >= countOfElements) {
            return null;
        }
        return array[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= countOfElements) {
            System.out.println("Index out of bounds");
            return;
        }
        System.arraycopy(array, index + 1, array, index, countOfElements - index);
        countOfElements--;
    }

    public void addAll(Collection<? extends E> collection) {
        if (!collection.isEmpty()) {
            for (E element : collection) {
                add(element);
            }
        } else {
            System.out.println("Collection is empty");
        }
    }

    public void print(){
        for (int i = 0; i < countOfElements; i++) {
            System.out.println(array[i]);
        }
    }

}
