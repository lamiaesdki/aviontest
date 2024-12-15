package com.example.aviontest.dao.respositories;

import com.example.aviontest.dao.entities.Avion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AvionRepository extends JpaRepository<Avion, Long> {
    Avion findByModel(String model);

    boolean existsByMatricul(String matricul);
    Optional<Avion> findByModelAndPrice(String model, Double price);

}
