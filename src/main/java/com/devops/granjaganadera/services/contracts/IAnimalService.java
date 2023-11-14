package com.devops.granjaganadera.services.contracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.devops.granjaganadera.entities.Animal;

public interface IAnimalService {

    public ResponseEntity<Animal> create(Animal animal);

    public ResponseEntity<Animal> show(long id);

    public ResponseEntity<Animal> update(Animal animal);

    public ResponseEntity<Boolean> delete(Long id);
    
}
