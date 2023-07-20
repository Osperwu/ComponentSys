package com.ComponentSysJPA.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
public class EmployeePO {
    public EmployeePO() {
    }

    public EmployeePO(String name, String team, String email, Date birthDate) {
        this.emp_name = name;
        this.emp_team = team;
        this.emp_email = email;
        this.emp_birthDate = birthDate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emp_id;
    private String emp_name;
    private String emp_team;
    private String emp_email;
    private Date emp_birthDate;

//    public Long getEmp_id() {
//        return emp_id;
//    }
//
//    public void setEmp_id(Long emp_id) {
//        this.emp_id = emp_id;
//    }
//
//    public String getEmp_name() {
//        return emp_name;
//    }
//
//    public void setEmp_name(String emp_name) {
//        this.emp_name = emp_name;
//    }
//
//    public String getEmp_team() {
//        return emp_team;
//    }
//
//    public void setEmp_team(String emp_team) {
//        this.emp_team = emp_team;
//    }
//
//
//    public Date getEmp_birthDate() {
//        return emp_birthDate;
//    }
//
//    public void setEmp_birthDate(Date emp_birthdate) {
//        this.emp_birthDate = emp_birthdate;
//    }
}
