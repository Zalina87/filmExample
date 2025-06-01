package ru.example.edu.model;

public class Film {
    private String name;
    private String genre;
    private String country;

    public Film(String name, String genre, String country) {
        this.name = name;
        this.genre = genre;
        this.country = country;
    }

    @Override
    public String toString() {
        return "name: " + name + " genre: " + genre + " country: " + country;
    }
}
