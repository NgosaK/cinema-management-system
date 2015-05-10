package za.ac.cput.ngosa.confFactoryTest;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.ngosa.conf.factory.EmployeeFactory;
import za.ac.cput.ngosa.conf.factory.ManagerFactory;
import za.ac.cput.ngosa.domain.Employee;
import za.ac.cput.ngosa.domain.Manager;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 2015/05/09.
 */
public class ManagerFactoryTest extends TestCase {

    @Test
    public void testCreateManager() throws Exception {

        Map<String, String> values = new HashMap<String, String>();


        values.put("jobTitle", "F&B Manager");
        values.put("phoneNumber", "09448754");
        values.put("name", "jack");
        values.put("department", "F&B");


        Manager manager = ManagerFactory.createManager(values, 556, 674);

        Assert.assertEquals("F&B Manager", manager.getJobTitle());
    }

    @Test
    public void testUpdateManager()  throws Exception
    {
        Map<String,String> values= new HashMap<String,String>();

        values.put("jobTitle", "F&B Manager");
        values.put("phoneNumber", "09448754");
        values.put("name", "jack");
        values.put("department", "F&B");

        Manager manager = ManagerFactory.createManager(values, 556, 674);


        Manager newManager= new Manager
                .Builder()
                .copy(manager)
                .build();

        Assert.assertEquals("jack",newManager.getName());
        Assert.assertEquals("09448754",newManager.getPhoneNumber());
        Assert.assertEquals(674,newManager.getId());
        Assert.assertEquals("F&B Manager",newManager.getJobTitle());
        Assert.assertEquals(556,newManager.getNumberOfEmployees());
        Assert.assertEquals("F&B",newManager.getDepartment());
    }

}