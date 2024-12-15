package com.example.aviontest.mappers;

import com.example.aviontest.dao.entities.Avion;
import com.example.aviontest.dto.AvionDTO;
import org.springframework.stereotype.Component;

@Component
public class AvionMapper {

    public AvionDTO toDTO(Avion avion) {
        AvionDTO dto = new AvionDTO();
        dto.setModel(avion.getModel());
        dto.setColor(avion.getColor());
        dto.setMatricul(avion.getMatricul());
        dto.setPrice(avion.getPrice());

        return dto;
    }

    public Avion toEntity(AvionDTO dto) {
        Avion avion = new Avion();
        avion.setModel(dto.getModel());
        avion.setColor(dto.getColor());
        avion.setMatricul(dto.getMatricul());
        avion.setPrice(dto.getPrice());
        return avion;
    }
}