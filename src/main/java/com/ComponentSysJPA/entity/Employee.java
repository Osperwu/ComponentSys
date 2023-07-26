package com.ComponentSysJPA.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.sql.Date;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    public Employee(String name, String team, long birth, String email) {
        this.emp_name = name;
        this.emp_team = team;
        this.emp_email = email;
        this.emp_birth = birth;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emp_id;
    private String emp_name;
    private String emp_team;
    private String emp_email;
    private long emp_birth;

    /**
     *CREATE TABLE `whirlpool`.`Employee` (
     *   `emp_id` INT NOT NULL,
     *   `emp_name` VARCHAR(45) NOT NULL,
     *   `emp_team` VARCHAR(45) NOT NULL,
     *   `emp_email` VARCHAR(45) NOT NULL,
     *   `emp_birth` VARCHAR(45) NOT NULL,
     *   PRIMARY KEY (`emp_id`));
     */

}





