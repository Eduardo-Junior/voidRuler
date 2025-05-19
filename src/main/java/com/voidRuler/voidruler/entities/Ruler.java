package com.voidRuler.voidruler.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Ruler {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int age;
    private String title;
    private String ideology;

    @OneToOne
    @JoinColumn(name = "empire_id")
    private Empire empire;

}
