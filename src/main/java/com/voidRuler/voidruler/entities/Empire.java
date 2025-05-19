package com.voidRuler.voidruler.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder

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
    
}
