package com.example.aviontest;


import com.example.aviontest.dao.respositories.AvionRepository;
import com.example.aviontest.dto.AvionDTO;

import com.example.aviontest.service.AvionManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AviontestApplication {

    public static void main(String[] args) {
        SpringApplication.run(AviontestApplication.class, args);
    }

    @Bean
    CommandLineRunner start(AvionRepository avionRepository, AvionManager avionManager) {
        return args -> {
            // Creating sample AvionDTO objects
            AvionDTO avion1 = new AvionDTO("Airbus A320", "White", "ABC123", 2000000.0);
            AvionDTO avion2 = new AvionDTO("Boeing 777", "Blue", "DEF456", 3000000.0);
            AvionDTO avion3 = new AvionDTO("Cessna 172", "Red", "GHI789", 500000.0);

            // Saving AvionDTO objects using AvionManager
            avionManager.save(avion1);
            avionManager.save(avion2);
            avionManager.save(avion3);

            // Printing confirmation to console
            System.out.println("Avions added:");
            System.out.println(avion1.getModel());
            System.out.println(avion2.getModel());
            System.out.println(avion3.getModel());
        };
    }
}
