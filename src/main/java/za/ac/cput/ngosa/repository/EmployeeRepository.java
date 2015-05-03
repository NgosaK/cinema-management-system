package za.ac.cput.ngosa.repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.ngosa.domain.Employee;

/**
 * Created by User on 2015/05/03.
 */
public interface EmployeeRepository extends CrudRepository<Employee,Long> {
    public Employee findByCode(String code);
}
