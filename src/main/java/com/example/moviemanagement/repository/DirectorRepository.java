package com.example.moviemanagement.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.moviemanagement.model.Director;

@Repository
public interface DirectorRepository extends JpaRepository<Director, Long>{

}
