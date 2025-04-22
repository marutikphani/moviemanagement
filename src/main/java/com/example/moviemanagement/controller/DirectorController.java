package com.example.moviemanagement.controller;

import com.example.moviemanagement.model.Director;
import com.example.moviemanagement.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/directors")
public class DirectorController {

    @Autowired
    private final DirectorService directorService;

    public DirectorController(DirectorService directorService) {
        this.directorService = directorService;
    }

    @GetMapping
    public List<Director> getAllDirectors() {
        return directorService.getAllDirectors();
    }

    @PostMapping
    public Director addDirector(@RequestBody Director director) {
        return directorService.addDirector(director);
    }

    @GetMapping("/country/{country}")
    public List<Director> getDirectorsByCountry(@PathVariable String country){
        return directorService.findDirectorsByCountry(country);
    }
}
