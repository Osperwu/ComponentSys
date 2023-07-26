package com.ComponentSysJPA.controller;

import com.ComponentSysJPA.entity.Employee;
import com.ComponentSysJPA.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Controller
@RestController
@RequestMapping("/getEmp")
public class EmpController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/build")
    public String buildTableAndData() {

        ArrayList<Employee> employees = new ArrayList<>();
        /*** 建立測試資料 ***/
        Employee emp1 = Employee.builder()
                                .emp_name("Michael")
                                .emp_team("a")
                                .emp_birth(19960101)
                                .emp_email("test@gmail.com")
                                .build();
//        Employee emp1 = new Employee("Michael", "a", 19960101, "test@gmail.com");
        employees.add(emp1);

        Employee emp2 = Employee.builder()
                                .emp_name("Cherry")
                                .emp_team("b")
                                .emp_birth(19960101)
                                .emp_email("test@gmail.com")
                                .build();
//        Employee emp2 = new Employee(2l,"Cherry", "b", 19960101, "test@gmail.com");
//        Employee emp2 = new Employee("Cherry", "b", 19960101, "test@gmail.com");
        employees.add(emp2);

        Employee emp3 = Employee.builder()
                                .emp_name("Osper")
                                .emp_team("b")
                                .emp_birth(19960101L)
                                .emp_email("test@gmail.com")
                                .build();
//        Employee emp3 = new Employee(3l,"Osper", "c", 19960101, "test@gmail.com");
//        Employee emp3 = new Employee("Osper", "c", 19960101, "test@gmail.com");
        employees.add(emp3);

        employees.forEach(employee -> employeeRepository.save(employee));

        return "Done build.";
    }

    @GetMapping()
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @GetMapping("/{number1}/{number2}")
    public List<Employee> getByRange(@PathVariable("number1") Long number1, @PathVariable("number2") Long number2) {
        return employeeRepository.findByPriorityBetween(number1, number2);
    }

    @GetMapping("/{id}")
    public Optional<Employee> getById(@PathVariable("id") Long Id) {
        return employeeRepository.findById(Id);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable("id") Long Id) {
        employeeRepository.deleteById(Id);

        if (!employeeRepository.findById(Id).isPresent()) return "Delete Successfully.";

        return "Delete failed.";
    }

}
