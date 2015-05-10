package za.ac.cput.ngosa.confFactoryTest;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.ngosa.conf.factory.BeverageFactory;
import za.ac.cput.ngosa.domain.Beverage;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 2015/05/07.
 */
public class BeverageFactoryTest extends TestCase {

    @Test
    public void testBeverageCreate() throws  Exception{

        Map<String,String> values= new HashMap<String,String>();


        values.put("name","cream soda");
        values.put("category","soda");

        Beverage beverage= BeverageFactory.createBeverage(values,556,10.00,330.50);

        Assert.assertEquals(556,beverage.getCode());
    }

    @Test
    public void testUpdateBeverage()  throws Exception
    {
        Map<String,String> values= new HashMap<String,String>();

        values.put("category","soda");
        values.put("name", "cream soda");

        Beverage beverage= BeverageFactory.createBeverage(values,556,10.00,330.50);

        Beverage newBeverage= new Beverage
                .Builder()
                .copy(beverage)
                .build();

        Assert.assertEquals("cream soda",newBeverage.getName());
        Assert.assertEquals("soda",newBeverage.getCategory());
        Assert.assertEquals(556,newBeverage.getCode());
        Assert.assertEquals(10.00,newBeverage.getPrice());
        Assert.assertEquals(330.50,newBeverage.getVolume());

    }
}
