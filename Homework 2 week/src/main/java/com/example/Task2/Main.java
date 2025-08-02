package com.example.Task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(Arrays.asList(
                        new Book("a", 100, 2000),
                        new Book("b", 50, 2000),
                        new Book("c", 70, 1996),
                        new Book("d", 200, 1980),
                        new Book("e", 187, 2001)),"1"),
                new Student(Arrays.asList(
                        new Book("a", 100, 2000),
                        new Book("b", 50, 2000),
                        new Book("c", 70, 1996),
                        new Book("i", 72, 1901),
                        new Book("j", 105, 2001),
                        new Book("k", 345, 1999)),"2"),
                new Student(Arrays.asList(
                        new Book("a", 100, 2000),
                        new Book("b", 50, 2000),
                        new Book("c", 70, 1996),
                        new Book("p", 345, 1954),
                        new Book("q", 87, 2014),
                        new Book("r", 723, 1934),
                        new Book("s", 624, 1967)),"3")
        );

        students.stream()
                .peek(student -> System.out.println(student))
                .map(student -> student.getBooks())
                .flatMap(books -> books.stream())
                .sorted(Comparator.comparingInt(book -> book.getNumberOfPages()))
                .distinct()
                .filter(book -> book.getYearOfPublication() > 2000)
                .limit(3)
                .map(book -> book.getYearOfPublication())
                .findAny()
                .ifPresentOrElse(year -> System.out.println(year),
                        () -> System.out.println("Такая книга отсутствует!"));
    }
}
