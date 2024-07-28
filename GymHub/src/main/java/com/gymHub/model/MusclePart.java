package com.gymHub.model;

import jakarta.persistence.*;

@Entity
@Table(name = "muscle_part")
public class MusclePart {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String musclePart;

    private MusclePart(){

    }

    public MusclePart(String musclePart) {
        this.musclePart = musclePart;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMusclePart() {
        return musclePart;
    }

    public void setMusclePart(String musclePart) {
        this.musclePart = musclePart;
    }
}
