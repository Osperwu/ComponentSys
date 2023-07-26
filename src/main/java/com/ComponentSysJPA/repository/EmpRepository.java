package com.ComponentSysJPA.repository;

import com.ComponentSysJPA.entity.Emp;
import com.ComponentSysJPA.entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EmpRepository extends CrudRepository<Emp, Long> {
        List<Emp> findAll();
        Optional<Emp> findById(Long id);
        void deleteById(Long id);

        @Query(value="SELECT * FROM Emp as e WHERE e.empId BETWEEN ?1 AND ?2 " ,nativeQuery = true)
        List<Employee> findByPriorityBetween(Long number1, Long number2);
    }
