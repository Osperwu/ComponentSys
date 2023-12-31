package com.ComponentSysJPA.repository;

import com.ComponentSysJPA.entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
        List<Employee> findAll();
        Optional<Employee> findById(Long id);
        void deleteById(Long id);

        @Query(value="SELECT * FROM Employee as e WHERE e.emp_id BETWEEN ?1 AND ?2 " ,nativeQuery = true)
        List<Employee> findByPriorityBetween(Long number1, Long number2);
    }
