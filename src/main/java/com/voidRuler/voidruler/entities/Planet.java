package com.voidRuler.voidruler.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder

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


    public void habitabilityBonus() {]

        double bonusPercent = Math.min(this.getHabitability() / 100.0, 0.15);
        int popsBonus = (int) Math.round(this.getPopulation() * bonusPercent);
        this.setPopulation(this.getPopulation() + popsBonus);
    }
    
}
