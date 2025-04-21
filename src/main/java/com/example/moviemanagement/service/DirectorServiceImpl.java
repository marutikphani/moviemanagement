package com.example.moviemanagement.service;

import org.springframework.stereotype.Service;
import com.example.moviemanagement.repository.DirectorRepository;
import com.example.moviemanagement.model.Director;
import java.util.List;

@Service
public class DirectorServiceImpl implements DirectorService {

    private final DirectorRepository directorRepository;

    public DirectorServiceImpl(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }
    @Override
    public List<Director> getAllDirectors() {
        return directorRepository.findAll();
    }

    @Override
    public Director addDirector(Director director) {
        return directorRepository.save(director);
    }

    @Override
    public List<Director> findDirectorsByCountry(String country){
        return directorRepository.findByCountryIgnoreCase(country);
    }
}

