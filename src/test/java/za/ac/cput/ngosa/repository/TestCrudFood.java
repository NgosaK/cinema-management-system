package za.ac.cput.ngosa.repository;

import junit.framework.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import za.ac.cput.ngosa.App;
import za.ac.cput.ngosa.domain.Food;

/**
 * Created by User on 2015/05/10.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class TestCrudFood extends AbstractTestNGSpringContextTests {
    private int code;

    @Autowired
    private FoodRepository repository;

@Test
    public void testCreate() throws Exception{

    Food food= new Food.Builder()
            .category("snack")
            .name("popcorn")
            .weight(200.00)
            .price(30.00)
            .code(849)
            .build();

    repository.save(food);
    code=food.getCode();

    Assert.assertNotNull(food.getCode());
}

    @Test
    public void testRead() throws Exception
    {
        Food food= repository.findOne(code);

        Assert.assertEquals(849,food.getCode());
    }

    @Test
    public void testUpdate() throws Exception
    {
        Food newFood= new Food.Builder()
                .code(999)
                .build();
        repository.save(newFood);

        code= newFood.getCode();
        Food updateFood= repository.findOne(code);

        Assert.assertEquals(999,updateFood.getCode());
    }

    @Test
    public void testDelete() throws Exception{
        Food food= repository.findOne(code);
        repository.delete(food);
        Food newFood= repository.findOne(code);

        Assert.assertNull(newFood);
    }
}
