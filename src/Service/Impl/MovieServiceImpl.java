package Service.Impl;

import Service.MovieService;
import db.DataBase;
import model.Movie;

import java.time.LocalDate;
import java.util.Collections;
import java.util.LinkedList;

public class MovieServiceImpl implements MovieService {

    DataBase dataBase = new DataBase();

    @Override
    public LinkedList<Movie> getAll() {
        return dataBase.movieLinkedList;
    }

    @Override
    public void addMovie(LinkedList<Movie> movies) {
        dataBase.movieLinkedList.addAll(movies);
    }

    @Override
    public void getAllMovies() {
        for (Movie movie : dataBase.movieLinkedList) {
            System.out.println(movie);
        }
    }

    @Override
    public void findMovieByNameOrPartName(String name) {
        for (int i = 0; i < dataBase.movieLinkedList.size(); i++) {
            if (dataBase.movieLinkedList.get(i).getName().equalsIgnoreCase(name)) {
                System.out.println(dataBase.movieLinkedList.get(i));
                break;
            } else System.out.println(" Invalit");

        }
    }

    @Override
    public void findMovieByActorName(String actorName) {
        for (int i = 0; i < dataBase.movieLinkedList.size(); i++) {
            for (int l = 0; l < dataBase.movieLinkedList.get(i).getActors().size(); l++) {
                if (dataBase.movieLinkedList.get(i).getActors().get(l).getFullName().equalsIgnoreCase(actorName)) {
                    System.out.println(dataBase.movieLinkedList.get(i));
                }
            }
        }
    }

    @Override
    public void findMovieByYear(LocalDate year) {
        for (int i = 0; i < dataBase.movieLinkedList.size(); i++) {
           if (year.equals(dataBase.movieLinkedList.get(i).getYear())){
               System.out.println(dataBase.movieLinkedList.get(i));
               return;
           }
           if (i != dataBase.movieLinkedList.size()){
               System.out.println(" Invalit");
           }
        }

    }

    @Override
    public void findMovieByProducer(String producerName) {
        for (int i = 0; i < dataBase.movieLinkedList.size(); i++) {
            for (int l = 0; l < dataBase.movieLinkedList.get(i).getProducer().size(); l++) {
                if (dataBase.movieLinkedList.get(i).getProducer().get(l).getFirstName().equalsIgnoreCase(producerName)){
                    System.out.println(dataBase.movieLinkedList.get(i));
                }
            }
        }
        }
    @Override
    public void findMovieByGenre(String genre) {
        for (int i = 0; i < dataBase.movieLinkedList.size(); i++) {
            if (dataBase.movieLinkedList.get(i).getGenre().equalsIgnoreCase(genre)){
                System.out.println(dataBase.movieLinkedList.get(i));
            }
        }

    }

    @Override
    public void findMovieByRole(String role) {
        for (int i = 0; i < dataBase.movieLinkedList.size(); i++) {
            for (int l = 0; l < dataBase.movieLinkedList.get(i).getActors().size(); l++) {
                if (dataBase.movieLinkedList.get(i).getActors().get(l).getRole().equalsIgnoreCase(role)){
                    System.out.println(dataBase.movieLinkedList.get(i));
                }
            }
        }

    }

    @Override
    public void sortByMovieName(String ascOrDesc) {
        LinkedList<Movie> movieLinkedListSort = new LinkedList<>(dataBase.movieLinkedList);
        if ("esc".equalsIgnoreCase(ascOrDesc)) {
            Collections.reverse(movieLinkedListSort);
        }
            dataBase.movieLinkedList = movieLinkedListSort;
            System.out.println(movieLinkedListSort);
    }

    @Override
    public void fromAToZ() {

    }

    @Override
    public void fromZToA() {

    }

    @Override
    public void sortByYear(String ascOrDesc) {
     LinkedList<Movie> moviesSort = new LinkedList<>(dataBase.movieLinkedList);
     if ("desc".equalsIgnoreCase(ascOrDesc)){

     }
    }
}
