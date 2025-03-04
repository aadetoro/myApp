package com.example.myappdemo.Model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Beer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private double alcoholContent;

    public Beer(Long id, String name, double alcoholContent) {
        this.id = id;
        this.name = name;
        this.alcoholContent = alcoholContent;
    }

    public Beer() {

    }
}

