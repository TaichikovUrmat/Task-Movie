package Service;

import model.Actor;
import model.Movie;

import java.time.LocalDate;
import java.util.LinkedList;

public interface MovieService {

    LinkedList<Movie> getAll();

    public void  addMovie(LinkedList<Movie> movies);
    void getAllMovies();
    void findMovieByNameOrPartName(String name);
   void findMovieByActorName(String actorName);
   void  findMovieByYear(LocalDate year);
   void  findMovieByProducer(String producerName);
   void  findMovieByGenre(String genre);
   void  findMovieByRole(String role);
   void sortByMovieName(String ascOrDesc);
   void  fromAToZ();
   void fromZToA();
   void sortByYear(String ascOrDesc);


}
