package com.example.moviemanagement.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.moviemanagement.model.Director;

import java.util.List;

@Repository
public interface DirectorRepository extends JpaRepository<Director, Long>{
    List<Director> findByCountryIgnoreCase(String country);
}
