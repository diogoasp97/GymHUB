package com.gymHub.model;

import jakarta.persistence.*;

@Entity
@Table(name = "exercise")
public class Exercise {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private Long musclePartId;
    private String exercise;
    private String description;

    private Exercise(){

    }

    public Exercise(Long musclePartId, String exercise, String description) {
        this.musclePartId = musclePartId;
        this.exercise = exercise;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMusclePartId() {
        return musclePartId;
    }

    public void setMusclePartId(Long musclePartId) {
        this.musclePartId = musclePartId;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
