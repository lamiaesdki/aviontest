package com.example.aviontest.service;

import com.example.aviontest.dto.AvionDTO;

public interface AvionService {
    AvionDTO findByModel(String model);
    AvionDTO findByModelAndPrice(String model, Double price);
    AvionDTO save(AvionDTO avionDTO);
    boolean delete(Long id);
}
