package model;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class Movie implements Comparable<Movie> {
    private long id;
    private String name;
    private LocalDate year ;  // год
    private String genre; // жанр
    private List<Producer> producer;
    private List<Actor> actors;

    public Movie(long id, String name, LocalDate year, String genre, List<Producer> producer, List<Actor> actors) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.producer = producer;
        this.actors = actors;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Producer> getProducer() {
        return producer;
    }

    public void setProducer(List<Producer> producer) {
        this.producer = producer;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", producer=" + producer +
                ", actors=" + actors +
                '}';
    }

    @Override
    public int compareTo(Movie o) {
        return this.name.compareTo(o.getName());
    }
   public static Comparator<Movie> comparator = new Comparator<Movie>() {
       @Override
       public int compare(Movie o1, Movie o2) {
           return o1.year.compareTo(o2.year);
       }
   };


}
