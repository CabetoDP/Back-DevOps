package com.devops.granjaganadera.services.implementations;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devops.granjaganadera.entities.*;
import com.devops.granjaganadera.repositories.contracts.IAnimalRepository;
import com.devops.granjaganadera.services.contracts.IAnimalService;

@Service
public class AnimalService implements IAnimalService {

    @Autowired
    private IAnimalRepository animalRepository;
    
    @Override
    public ResponseEntity<Animal> create(Animal animal) {
        try {
          
            Animal animalSaved = this.animalRepository.save(animal);
            return new ResponseEntity<Animal>(animalSaved, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Animal>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Animal> show(long id) {
        Animal animal = this.animalRepository.mostrar(id);
        return new ResponseEntity<Animal>(animal, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Animal> update(Animal animal) {
        try {
            Animal animalUpdated = this.animalRepository.save(animal);
            return new ResponseEntity<Animal>(animalUpdated, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Animal>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Boolean> delete(Long id) {
        try {
            this.animalRepository.deleteById(id);
            return new ResponseEntity<Boolean>(true, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Boolean>(false, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<List<Animal>> findAll() {
        try {
            List<Animal> animals = this.animalRepository.findAll();
            return new ResponseEntity<List<Animal>>(animals, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
