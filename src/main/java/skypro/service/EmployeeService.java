package skypro.service;

import skypro.entity.Employee;
import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployees();
    Employee getEmployeeById(int id);
    void addEmployee(Employee Employee);
    void updateEmployee(Employee Employee);
    void deleteEmployee(int id);
}