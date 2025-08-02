package com.example.Task2;

import java.util.concurrent.LinkedTransferQueue;

public class Book {
    String name;
    int numberOfPages;
    int yearOfPublication;

    public Book(String name, int numberOfPages, int yearOfPublication) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.yearOfPublication = yearOfPublication;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }


}
