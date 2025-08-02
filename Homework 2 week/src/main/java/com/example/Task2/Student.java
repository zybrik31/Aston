package com.example.Task2;

import java.util.List;
import java.util.stream.Collectors;

public class Student {
    List<Book> books;
    String name;

    public Student(List<Book> books, String name) {
        this.books = books;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Студент: " + name;
    }

    public List<String> getBooks(){
        List<String> nameOfBooks = books.stream()
                .map(Book -> Book.name)
                .toList();
        return nameOfBooks;
    }
}
