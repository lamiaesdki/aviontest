package com.example.aviontest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



public class AvionDTO {
    private String model;
    private String  color;
    private String  matricul;
    private Double price;

    public AvionDTO(String model, String color, String matricul, Double price) {
        this.model = model;
        this.color = color;
        this.matricul = matricul;
        this.price = price;
    }

    // Default constructor (if needed by the framework)
    public AvionDTO() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricul() {
        return matricul;
    }

    public void setMatricul(String matricul) {
        this.matricul = matricul;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
