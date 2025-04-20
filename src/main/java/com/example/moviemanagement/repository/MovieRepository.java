package com.example.moviemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.moviemanagement.model.Movie;
import org.springframework.stereotype.Repository;
import com.example.moviemanagement.model.Director;
import java.util.List;

@Repository
public interface  MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByGenre(String genre);
    List<Movie> findByDirector(Director director);
    List<Movie> findByTitle(String title);


}
