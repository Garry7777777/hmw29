package skypro.dao;

import skypro.entity.Employee;
import java.util.List;

public interface EmployeeDAO {

    List<Employee> getEmployees();
    Employee getEmployeeById(int id);
    void addEmployee(Employee person);
    void updateEmployee(Employee person);
    void deleteEmployee(int id);

}