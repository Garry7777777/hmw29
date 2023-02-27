package skypro.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import skypro.dao.EmployeeDAO;
import skypro.entity.Employee;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO EmployeeDAO;
    public EmployeeServiceImpl(EmployeeDAO EmployeeDAO) {
        this.EmployeeDAO = EmployeeDAO;
    }

    @Override
    @Transactional
    public List<Employee> getEmployees() {
        return EmployeeDAO.getEmployees();
    }

    @Override
    @Transactional
    public Employee getEmployeeById(int id) {
        return EmployeeDAO.getEmployeeById(id);
    }

    @Override
    @Transactional
    public void addEmployee(Employee Employee) {
        EmployeeDAO.addEmployee(Employee);
    }

    @Override
    @Transactional
    public void updateEmployee(Employee Employee) {
        EmployeeDAO.updateEmployee(Employee);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        EmployeeDAO.deleteEmployee(id);
    }
}