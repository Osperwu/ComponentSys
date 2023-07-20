package com.ComponentSysJPA.repository;

import com.ComponentSysJPA.entity.EmployeePO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<EmployeePO, Long> {
        List<EmployeePO> findAll();
        Optional<EmployeePO> findById(Long id);
        void deleteById(Long id);

        @Query(value="SELECT * FROM EMPLOYEE as e WHERE e.EMP_ID BETWEEN ?1 AND ?2 " ,nativeQuery = true)
        List<EmployeePO> findByPriorityBetween(Long number1, Long number2);
    }
