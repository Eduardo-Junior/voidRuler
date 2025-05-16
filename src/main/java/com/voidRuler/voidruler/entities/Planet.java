package com.voidRuler.voidruler.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Planet {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String type;
    private int population;
    private int resourcesBonus;
    private int techBonus;
    private int developmentLevel;
    private int habitability;

    
}
