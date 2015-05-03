package za.ac.cput.ngosa.services.impli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.ngosa.domain.Employee;
import za.ac.cput.ngosa.repository.EmployeeRepository;
import za.ac.cput.ngosa.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2015/05/03.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
   @Autowired
    EmployeeRepository repository;


    @Override
    public List<Employee> getEmployees() {
        List<Employee> allEmployees= new ArrayList<Employee>();
        Iterable<Employee> employees= repository.findAll();

        for(Employee employee: employees)
        {
            allEmployees.add(employee);
        }
        return allEmployees;
    }
}
