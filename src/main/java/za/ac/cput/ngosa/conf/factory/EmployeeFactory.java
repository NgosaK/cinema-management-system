package za.ac.cput.ngosa.conf.factory;

/**
 * Created by User on 2015/05/01.
 */
import za.ac.cput.ngosa.domain.Employee;

import java.util.List;
import java.util.Map;

public class EmployeeFactory {

    public static Employee createEmployee(
            Map<String,String>values, long id, String
            name)
    {
        Employee employee= new Employee
                .Builder()
                .name(name)
                .jobTitle(values.get("jobTitle"))
                .id(id)
                .phoneNumber(values.get("phoneNumber"))
                .build();

        return employee;




    }
}
