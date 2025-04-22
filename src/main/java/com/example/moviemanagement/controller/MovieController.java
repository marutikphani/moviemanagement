package com.example.moviemanagement.controller;

import com.example.moviemanagement.model.Movie;
import com.example.moviemanagement.service.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/ping")
    public String ping() {
        return "I'm alive!";
    }


    @PostMapping
    public Movie addMovie(@RequestBody Movie movie) {
        return movieService.addMovie(movie);
    }

    @GetMapping("/genre/{genre}")
    public List<Movie> getMoviesByGenre(@PathVariable String genre) {
        return movieService.getMoviesByGenre(genre);
    }

    @GetMapping("/director/{name}")
    public List<Movie> getMoviesByDirectorName(@PathVariable String name) {
        return movieService.getMoviesByDirectorName(name);
    }
}
