package com.gymHub.controller;

import com.gymHub.model.MusclePart;
import com.gymHub.repository.MusclePartRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MusclePartController {

    private final MusclePartRepository musclePartRepository;

    public MusclePartController(MusclePartRepository musclePartRepository){
        this.musclePartRepository = musclePartRepository;
    }

    @GetMapping("/musclePart")
    public Iterable<MusclePart> findAllMuscleParts(){
        return this.musclePartRepository.findAll();
    }
}
