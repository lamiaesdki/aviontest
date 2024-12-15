package com.example.aviontest.service;

import com.example.aviontest.dao.entities.Avion;
import com.example.aviontest.dao.respositories.AvionRepository;
import com.example.aviontest.dto.AvionDTO;
import com.example.aviontest.mappers.AvionMapper;
import org.springframework.stereotype.Service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvionManager implements AvionService {

    @Autowired
    private AvionRepository avionRepository;

    @Autowired
    private AvionMapper avionMapper;

    @Override
    public AvionDTO findByModel(String model) {
        return avionMapper.toDTO(avionRepository.findByModel(model));
    }

    @Override
    public AvionDTO findByModelAndPrice(String model, Double price) {
        return avionRepository.findByModelAndPrice(model, price)
                .map(avionMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("Avion not found"));
    }


    @Override
    public AvionDTO save(AvionDTO avionDTO) {
        if (avionRepository.existsByMatricul(avionDTO.getMatricul())) {
            throw new RuntimeException("Matricul already exists");
        }
        Avion avion = avionMapper.toEntity(avionDTO);
        avion = avionRepository.save(avion);
        return avionMapper.toDTO(avion);
    }

    @Override
    public boolean delete(Long id) {
        if (!avionRepository.existsById(id)) {
            return false;
        }
        avionRepository.deleteById(id);
        return true;
    }
}

