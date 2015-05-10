package za.ac.cput.ngosa.confFactoryTest;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.ngosa.conf.factory.EmployeeFactory;
import za.ac.cput.ngosa.conf.factory.FoodFactory;
import za.ac.cput.ngosa.domain.Employee;
import za.ac.cput.ngosa.domain.Food;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 2015/05/09.
 */
public class FoodFactoryTest extends TestCase {

    @Test
    public void testCreateFood() throws  Exception{

        Map<String,String> values= new HashMap<String,String>();


        values.put("name","whispers");
        values.put("category","candy");

        Food food= FoodFactory.createFood(values, 556, 15.00, 250.00);

        Assert.assertEquals(556, food.getCode());
    }

    @Test
    public void testUpdateFood()  throws Exception
    {
        Map<String,String> values= new HashMap<String,String>();

        values.put("name","whispers");
        values.put("category","candy");

        Food food= FoodFactory.createFood(values, 556, 15.00, 250.00);


        Food newFood= new Food
                .Builder()
                .copy(food)
                .build();

        Assert.assertEquals("whispers",newFood.getName());
        Assert.assertEquals("candy",newFood.getCategory());
        Assert.assertEquals(556,newFood.getCode());
        Assert.assertEquals(15.00,newFood.getPrice(), 0.01);
        Assert.assertEquals(250.00,newFood.getWeight(), 0.01);

    }
}
