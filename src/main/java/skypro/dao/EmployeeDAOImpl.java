package skypro.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import skypro.entity.Employee;
import java.util.List;

@Repository
public class EmployeeDAOImpl  implements EmployeeDAO {

    private SessionFactory sessionFactory;

    public EmployeeDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public List<Employee> getEmployees() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("From Employee").list();
    }

    public Employee getEmployeeById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Employee.class, id);
    }

    public void addEmployee(Employee person) {
        Session session = sessionFactory.getCurrentSession();
        session.save(person);
    }

    public void updateEmployee(Employee person) {
        Session session = sessionFactory.getCurrentSession();
        session.update(person);
    }

    public void deleteEmployee(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Employee> query = session.createQuery("delete from Employee where id=:id");
        query.setParameter("id", id);
        query.executeUpdate();
    }
}