package za.ac.cput.ngosa.repository;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import sun.reflect.annotation.ExceptionProxy;
import za.ac.cput.ngosa.App;
import za.ac.cput.ngosa.domain.Beverage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by User on 2015/05/03.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class TestCrudBeverage extends AbstractTestNGSpringContextTests {

    private int id;

    @Autowired
    private BeverageRepository repository;

    @Test
    public void testCreate() throws Exception{

       // List<Beverage> beverages= new ArrayList<Beverage>();
        Beverage beverage= new Beverage.Builder().volume(15.00).
                price(10.00).category("Candy").code( 768).name("whispers")
                .build();
        repository.save(beverage);
        id=beverage.getCode();
        Assert.assertNotNull(beverage.getCode());
    }

    @Test
    public void testRead() throws Exception{

        Beverage beverage= repository.findOne(768);
        Assert.assertEquals("cream soda",beverage.getName());
    }

    @Test
    public void testUpdateBeverage() throws  Exception{

        Beverage beverage= repository.findOne(id);
        Beverage newBeverage= new Beverage.Builder().category("Soda")
                .name("cream soda").code( 384).price(15.00).volume(300.50)
                .build();
        repository.save(newBeverage);
        Assert.assertEquals("cream soda",beverage.getName());
    }

    @Test
    public void testDeleteBeverage() throws Exception
    {
        Beverage beverage= repository.findOne(id);
        repository.delete(beverage);
        Beverage newBeverage= repository.findOne(id);
        Assert.assertNull(newBeverage);

    }
}
