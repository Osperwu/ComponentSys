package com.ComponentSysJPA.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Emp {
    public Emp() {
    }

    public Emp(String name, String team, long birth, String email) {
        this.name = name;
        this.team = team;
        this.email = email;
        this.birth = birth;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emp_id;
    private String name;
    private String team;
    private String email;
    private long birth;

}





