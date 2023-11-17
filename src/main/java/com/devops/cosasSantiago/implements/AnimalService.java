package com.devops.granjaganadera.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devops.cosasSantiago.animal.AnimalDto;
import com.devops.granjaganadera.entities.*;
import com.devops.granjaganadera.repositories.contrats.IAnimalRepository;
import com.devops.granjaganadera.repositories.contrats.IPartoRepository;

import com.devops.granjaganadera.services.contracts.IAnimalService;

@Service
public class AnimalService implements IAnimalService {

    @Autowired
    private IAnimalRepository animalRepository;


    @Autowired
    private IPartoRepository partoRepository;

    @Override
    public ResponseEntity<Animal> create(AnimalDto animalData) {
        try {
            Animal animal = new Animal();
            animal.setSexo(animalData.animal.sexo);
            animal.setEspecie(animalData.animal.especie);
            animal.setPeso(animalData.animal.peso);
            animal.setRaza(animalData.animal.raza);
            animal.setFechaAdquisicion(animalData.animal.fechaAdquisicion);
            animal.setFechaMuerte(animalData.animal.fechaMuerte);
            animal.setFechaNacimiento(animalData.animal.fechaNacimiento);
          
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

}
