package com.ComponentSysJPA;

import com.ComponentSysJPA.entity.Emp;
import com.ComponentSysJPA.entity.Employee;
import com.ComponentSysJPA.entity.Part;
import com.ComponentSysJPA.repository.EmpRepository;
import com.ComponentSysJPA.repository.EmployeeRepository;
import com.ComponentSysJPA.repository.PartRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ComponentSysJpaApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	PartRepository part;

	@Autowired
	EmpRepository empRepository;

	@Test
	void contextLoads() {
		System.err.println("test spring boot");
//		Employee emp3 = new Employee("Osper", "c", 19960101, "test@gmail.com");
//		employeeRepository.save(emp3);
		List<Employee> employeeList = employeeRepository.findAll();
		employeeList.forEach(p-> System.err.println(p));

//		List<Part> parts = part.findAll();
//		parts.forEach(p-> System.err.println(p));

//		List<Emp> empList = empRepository.findAll();
//		empList.forEach(p-> System.err.println(p));
	}

}
