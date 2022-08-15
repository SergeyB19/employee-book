package pro.sky.java.course2.service;

import java.util.Collection;

public interface EmployeeService {
    Employee add(String firstName, String lastName, double salary, int departmentId);

    Employee remove(String firstName, String lastName);

    Employee find(String firstName, String lastName);

    Collection<Employee> findAll();
}
