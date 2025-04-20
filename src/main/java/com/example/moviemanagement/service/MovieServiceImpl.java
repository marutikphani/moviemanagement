package com.example.moviemanagement.service;
import org.springframework.stereotype.Service;
import com.example.moviemanagement.model.Movie;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.moviemanagement.repository.MovieRepository;
import com.example.moviemanagement.model.Director;
import com.example.moviemanagement.repository.DirectorRepository;


@Service
public class MovieServiceImpl implements MovieService {
    private final MovieRepository movieRepository;
    private final DirectorRepository directorRepository;

    public MovieServiceImpl(MovieRepository movieRepository, DirectorRepository directorRepository) {
        this.movieRepository = movieRepository;
        this.directorRepository = directorRepository;
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
    @Override
    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public List<Movie> getMoviesByGenre(String genre) {
        return movieRepository.findByGenre(genre);
    }

    @Override
    public List<Movie> getMoviesByDirectorName(String name){
        Director director = directorRepository.findAll()
                .stream()
                .filter(d-> d.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
        if(director == null){
            return null;
        }
        return movieRepository.findByDirector(director);



    }
}
