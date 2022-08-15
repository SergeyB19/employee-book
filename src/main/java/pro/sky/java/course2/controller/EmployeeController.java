package pro.sky.java.course2.controller;

import com.example.skyprostreamapioptionalhw.model.Employee;
import com.example.skyprostreamapioptionalhw.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/add")
    public String addEmployee(@RequestParam("firstName") String name,
                              @RequestParam("lastName") String surname,
                              @RequestParam("departmentId") int department,
                              @RequestParam double salary) {
        return employeeService.add(name, surname, department, salary);
    }

    @GetMapping(path = "/remove")
    public String removeEmployee(@RequestParam("firstName") String name,
                                 @RequestParam("lastName") String surname) {
        return employeeService.remove(name, surname);
    }

    @GetMapping(path = "find")
    public String findEmployee(@RequestParam("firstName") String name,
                               @RequestParam("lastName") String surname) {
        return employeeService.find(name, surname);
    }

    @GetMapping
    public List<Employee> getAll() {
        return employeeService.getAll();
    }
}

