package com.devops.granjaganadera.repositories.contracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devops.granjaganadera.entities.Parto;

public interface IPartoRepository extends JpaRepository<Parto, Long> {

}