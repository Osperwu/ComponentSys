package com.ComponentSysJPA.controller;
import com.ComponentSysJPA.entity.EmployeePO;
import com.ComponentSysJPA.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;
import java.util.Optional;


@Controller
@RestController
@RequestMapping("/getEmp")
public class EmpController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/build")
    public String buildTableAndData(){

        /*** 建立測試資料 ***/
        EmployeePO emp = new EmployeePO();
        emp.setEmp_name("Michael");
        emp.setEmp_team("IT");
        emp.setEmp_birthDate(new Date(19920101));
        employeeRepository.save(emp);

        emp = new EmployeePO();
        emp.setEmp_name("Cherry");
        emp.setEmp_team("Salse");
        emp.setEmp_birthDate(new Date(19900101));
        employeeRepository.save(emp);

        emp = new EmployeePO();
        emp.setEmp_name("Stanley");
        emp.setEmp_team("Product");
        emp.setEmp_birthDate(new Date(19960101));
        employeeRepository.save(emp);

        return "Done build.";
    }

    @GetMapping()
    public List<EmployeePO> getAll(){
        return employeeRepository.findAll();
    }

    @GetMapping("/{number1}/{number2}")
    public List<EmployeePO> getByRange(@PathVariable("number1") Long number1, @PathVariable("number2") Long number2){
        return employeeRepository.findByPriorityBetween(number1,number2);
    }

    @GetMapping("/{id}")
    public Optional<EmployeePO> getById(@PathVariable("id") Long Id){
        return employeeRepository.findById(Id);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable("id") Long Id){
        employeeRepository.deleteById(Id);

        if(!employeeRepository.findById(Id).isPresent())
            return "Delete Successfully.";

        return "Delete failed.";
    }

}
