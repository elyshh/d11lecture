package sg.edu.nus.iss.d11lecture.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.nus.iss.d11lecture.model.Employee;

@RestController
@RequestMapping("/employees") // name = "/employee" - Spring Boot knows it is a name
public class EmployeeController {
    
    // @RequestMapping(path = "/list", method = RequestMethod.Get)
    @GetMapping(path = "/list")
    public List<Employee> getAllEmployees() {

        List<Employee> employees = new ArrayList<>();
        // Populate employee list with some information
        employees.add(new Employee("Ashley", "Chew", "ashchew@visa.com.sg"));
        employees.add(new Employee("Alicia", "Ong", "aliciaong@visa.com.sg"));
        employees.add(new Employee("Darien", "Lim", "darienlim@visa.com.sg"));

        return employees;
    }
}
