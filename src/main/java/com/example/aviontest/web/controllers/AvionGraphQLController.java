package com.example.aviontest.web.controllers;



import com.example.aviontest.dto.AvionDTO;
import com.example.aviontest.service.AvionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.MutationMapping;

@Controller
public class AvionGraphQLController {

    @Autowired
    private AvionService avionService;

    @QueryMapping
    public AvionDTO getAvionByModel(String model) {
        return avionService.findByModel(model);
    }

    @QueryMapping
    public AvionDTO getAvionByModelAndPrice(String model, Double price) {
        return avionService.findByModelAndPrice(model, price);
    }

    @MutationMapping
    public AvionDTO saveAvion(AvionDTO avionDTO) {
        return avionService.save(avionDTO);
    }

    @MutationMapping
    public boolean deleteAvion(Long id) {
        return avionService.delete(id);
    }
}
