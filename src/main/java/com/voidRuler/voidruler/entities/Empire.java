package com.voidRuler.voidruler.entities;

import jakarta.persistence.*;

@Entity
public class Empire {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private int population;
    private int techLevel;

    public Empire() {
        super();
    }

    public Empire(String name, int population, int techLevel) {
        this.name = name;
        this.population = population;
        this.techLevel = techLevel;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getTechLevel() {
        return techLevel;
    }

    public void setTechLevel(int techLevel) {
        this.techLevel = techLevel;
    }
}
