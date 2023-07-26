package com.ComponentSysJPA.repository;

import com.ComponentSysJPA.entity.Part;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PartRepository extends CrudRepository<Part, Long> {
    List<Part> findAll();

    @Override
    Optional<Part> findById(Long aLong);
}
