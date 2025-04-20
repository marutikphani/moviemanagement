package com.example.moviemanagement.service;

import com.example.moviemanagement.model.Director;

import java.util.List;

public interface DirectorService {
    List<Director> getAllDirectors();
    Director addDirector(Director director);
}
