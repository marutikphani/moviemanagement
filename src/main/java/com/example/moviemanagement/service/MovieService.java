package com.example.moviemanagement.service;
import java.util.List;
import com.example.moviemanagement.model.Movie;

public interface MovieService {

    List<Movie> getAllMovies();
    Movie addMovie(Movie movie);
    List<Movie> getMoviesByGenre(String genre);
    List<Movie> getMoviesByDirectorName(String director);
}
