package ru.example.edu;

import ru.example.edu.model.Film;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!");
        Film film1 = new Film("Волшебник изумрудного города", "мультфильм", "Россия");

        System.out.println(film1);
    }
}
