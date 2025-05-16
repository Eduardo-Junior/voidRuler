package com.voidRuler.voidruler.entities;

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


    public Planet(){
        super();
    }

    public Planet(String name, String type, int population, int resourcesBonus, int techBonus, int developmentLevel, int habitability){
        this.name = name;
        this.type = type;
        this.population = population;
        this.resourcesBonus = resourcesBonus;
        this.techBonus = techBonus;
        this.developmentLevel = developmentLevel;
        this.habitability = habitability;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getPopulation() {
        return population;
    }
    public void setPopulation(int population) {
        this.population = population;
    }
    public int getResourcesBonus() {
        return resourcesBonus;
    }
    public void setResourcesBonus(int resourcesBonus) {
        this.resourcesBonus = resourcesBonus;
    }
    public int getTechBonus() {
        return techBonus;
    }
    public void setTechBonus(int techBonus) {
        this.techBonus = techBonus;
    }
    public int getDevelopmentLevel() {
        return developmentLevel;
    }
    public void setDevelopmentLevel(int developmentLevel) {
        this.developmentLevel = developmentLevel;
    }
    public int getHabitability() {
        return habitability;
    }
    public void setHabitability(int habitability) {
        this.habitability = habitability;
    }

    public void habitabilityBonus() {]

        double bonusPercent = Math.min(this.getHabitability() / 100.0, 0.15);
        int popsBonus = (int) Math.round(this.getPopulation() * bonusPercent);
        this.setPopulation(this.getPopulation() + popsBonus);
    }
    
}
