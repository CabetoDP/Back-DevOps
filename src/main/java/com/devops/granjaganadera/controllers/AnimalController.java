package com.devops.granjaganadera.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devops.Requests.IdRequest;
import com.devops.granjaganadera.entities.Animal;
import com.devops.granjaganadera.services.contracts.IAnimalService;

@RestController
@RequestMapping("/animales")
public class AnimalController {

    @Autowired
    private IAnimalService animalService;

    @PostMapping("/create")
    private  ResponseEntity<Animal> createAnimal(@RequestBody Animal animal) {
        return this.animalService.create(animal);
    }

    @PostMapping("/show")
    private ResponseEntity<Animal> show(@RequestBody IdRequest id) {
        return this.animalService.show(id.id);
    }

    @PutMapping("/update")
    private ResponseEntity<Animal> updateAnimal(@RequestBody Animal animal) {
        return this.animalService.update(animal);
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Boolean> deleteAnimal(@RequestBody IdRequest id) {
        return this.animalService.delete(id.id);
    }

    @GetMapping("/list")
    private ResponseEntity<List<Animal>> getAllAnimals() {
        return this.animalService.findAll();
    }
}
