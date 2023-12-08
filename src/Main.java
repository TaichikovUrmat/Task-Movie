import Service.ActorService;
import Service.Impl.ActorServiceImpl;
import Service.Impl.MovieServiceImpl;
import Service.Impl.ProducerServiceImpl;
import Service.MovieService;
import Service.ProducerService;
import db.DataBase;
import model.Actor;
import model.Movie;
import model.Producer;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        ActorService actorService = new ActorServiceImpl();
        LinkedList<Actor> actors = new LinkedList<>(List.of(
                new Actor(1, "Ibraimov Eldarbek", " Досунун ролун ойноп жатат"),
                new Actor(2, "Abdyjaparov Roza ", "  Девушкасынын ролун ойноп жатат"),
                new Actor(3, "Temirov Ulan", "Жигитинин ролун ойнойе"),
                new Actor(1, "Manapova Tamara", "Жигиттин апасы")
        ));
        actorService.addActor(actors);
        dataBase.actorLinkedList.addAll(actors);

        ProducerService producerService = new ProducerServiceImpl();
        LinkedList<Producer> producers = new LinkedList<>(List.of(
                new Producer(1, "Urmat", "Taichikov")
        ));
        producerService.addProducer(producers);
        dataBase.producerLinkedList.addAll(producers);


        MovieService movieService = new MovieServiceImpl();
        LinkedList<Movie> movies = new LinkedList<>(List.of(
                new Movie(1, "Malysh", LocalDate.of(2023,11,5), "Комедия", producers, actors),
                new Movie(2,"Egiz",LocalDate.of(2023,6,8),"Комедия и жанр",producers,actors)
        ));
        movieService.addMovie(movies);
        dataBase.movieLinkedList.addAll(movies);
        for (Movie movie : dataBase.movieLinkedList) {
            System.out.println(movie);
        }
        while (true) {
            System.out.println("""
                        1.getAllMovies
                        2.findMovieByNameOrPartName(String name) // найти фильм по названию или названию части
                        3.findMovieByActorName(String actorName);  // найти фильм по имени актера
                        4 findMovieByYear(Year year);   //  Movie By Year (Год года);
                        5  findMovieByProducer(String producerName);
                        6  findMovieByGenre(Genre genre);
                        7  findMovieByRole(String role);  
                  Sortable:  //Сортируемый
                        8 sortByMovieName(String ascOrDesc);
                        9 -from A to Z
                        10 -from Z to A
                        11 sortByYear(String ascOrDesc);
                        12 -Ascending
                        13 -Descending
                        14 sortByProducer();
                        
                        """);
            switch (new Scanner(System.in).nextLine()) {
                case "1" -> {
                    movieService.getAllMovies();
                }
                case "2" -> {
                    System.out.print("Name movie? ");
                    String name = new Scanner(System.in).nextLine();
                    movieService.findMovieByNameOrPartName(name);
                }
                case "3"->{
                    System.out.print("Name actor ?  ");
                    String aktorName = new Scanner(System.in).nextLine();
                    movieService.findMovieByActorName(aktorName);
                }
                case "4"->{
                    movieService.findMovieByYear(LocalDate.of(2023,6,8));
                }
                case "5"->{
                    movieService.findMovieByProducer("Urmat");
                }
                case "6"->{
                    movieService.findMovieByGenre("Комедия");
                }
                case "7"->{
                    movieService.findMovieByRole(" Досунун ролун ойноп жатат");
                }
                case "8"->{
                    movieService.sortByMovieName("asc");
                }
                case "11"->{

                }


            }

        }
    }
}