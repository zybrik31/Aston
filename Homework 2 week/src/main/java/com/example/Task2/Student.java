package com.example.Task2;

import java.util.List;

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

    public List<Book> getBooks() {
        return books;
    }

    public List<String> getNameOfBooks(){
        List<String> nameOfBooks = books.stream()
                .map(book -> book.name)
                .toList();
        return nameOfBooks;
    }
    
    public List<Integer> getNumberOfPages(){
        List<Integer> pagesOfBooks = books.stream()
                .map(book -> book.numberOfPages)
                .toList();
        return pagesOfBooks;
    }
    
    public List<Integer> getYearsOfBooks(){
        List<Integer> yearsOfBooks = books.stream()
                .map(book -> book.yearOfPublication)
                .toList();
        return yearsOfBooks;
    }
}
