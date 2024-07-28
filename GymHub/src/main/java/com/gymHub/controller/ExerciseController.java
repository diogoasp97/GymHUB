package com.gymHub.controller;

import com.gymHub.model.Exercise;
import com.gymHub.repository.ExerciseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController()
public class ExerciseController {

    private final ExerciseRepository exerciseRepository;

    public ExerciseController(ExerciseRepository exerciseRepository){
        this.exerciseRepository = exerciseRepository;
    }

    @GetMapping("/exercises")
    public Iterable<Exercise> findAllExercises(){
        return this.exerciseRepository.findAll();
    }

    @GetMapping("/exercises/{id}")
    public Optional<Exercise> getExerciseById(@PathVariable Long id){
        return this.exerciseRepository.findById(id);
    }

    @PostMapping("/exercises")
    public Optional<Exercise> createExercise(@RequestBody Exercise exercise){
        return Optional.of(this.exerciseRepository.save(exercise));
    }

    @DeleteMapping("/exercises/{id}")
    public void deleteExerciseById(@PathVariable Long id){
        this.exerciseRepository.deleteById(id);
    }


}
