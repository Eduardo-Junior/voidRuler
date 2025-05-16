package com.voidRuler.voidruler.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
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

    public Ruler() {
        super();
    }

    public Ruler(Long id, String name, int age, String title, String ideology, Empire empire) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.title = title;
        this.ideology = ideology;
        this.empire = empire;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIdeology() {
        return ideology;
    }

    public void setIdeology(String ideology) {
        this.ideology = ideology;
    }

    public Empire getEmpire() {
        return empire;
    }

    public void setEmpire(Empire empire) {
        this.empire = empire;
    }

    
}
