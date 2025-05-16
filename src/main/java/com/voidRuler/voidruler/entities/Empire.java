package com.voidRuler.voidruler.entities;

import jakarta.persistence.*;

@Entity
public class Empire {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int population;
    private int techLevel;
    private int scienceOutput;
    private int militaryPower;
    private String governmentType;

    @OneToOne(mappedBy = "empire", cascade = CascadeType.ALL)
    private Ruler ruler;


    public Empire() {
        super();
    }

    public Empire(String name, int population, int techLevel, int scienceOutput, int militaryPower, String governmentType) {    
        this.name = name;
        this.population = population;
        this.techLevel = techLevel;
        this.scienceOutput = scienceOutput;
        this.militaryPower = militaryPower;
        this.governmentType = governmentType;
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

    public int getScienceOutput() {
        return scienceOutput;
    }

    public void setScienceOutput(int scienceOutput) {
        this.scienceOutput = scienceOutput;
    }

    public int getMilitaryPower() {
        return militaryPower;
    }

    public void setMilitaryPower(int militaryPower) {
        this.militaryPower = militaryPower;
    }

    public String getGovernmentType() {
        return governmentType;
    }

    public void setGovernmentType(String governmentType) {
        this.governmentType = governmentType;
    }

    public Ruler getRuler() {
        return ruler;
    }

    public void setRuler(Ruler ruler) {
        this.ruler = ruler;
    }

    
}
