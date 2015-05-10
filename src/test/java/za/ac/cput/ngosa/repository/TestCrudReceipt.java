package za.ac.cput.ngosa.repository;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import za.ac.cput.ngosa.App;
import za.ac.cput.ngosa.domain.Movie;
import za.ac.cput.ngosa.domain.Receipt;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2015/05/10.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class TestCrudReceipt extends AbstractTestNGSpringContextTests {

    private long id;

    @Autowired
    private ReceiptRepository repository;

    @Test
    public void testCreate() throws Exception
    {
        List <Movie> movies= new ArrayList<Movie>();
        Receipt receipt= new Receipt.Builder()
                .movieTitle(movies)
                .price(65.00)
                .item("movie")
                .quantity(2)
                .cashierName("Tom")
                .id(748)
                .total()
                .build();

        repository.save(receipt);
        id= receipt.getId();

        Assert.assertNotNull(receipt.getId());
    }

    @Test
    public void testRead() throws Exception{

        Receipt receipt= repository.findOne(id);

        Assert.assertEquals(748,receipt.getId());
    }

    @Test
    public void testUpdate() throws Exception
    {
        Receipt newReceipt= new Receipt.Builder()
                .id(545)
                .build();
        repository.save(newReceipt);

        id=newReceipt.getId();
        Receipt updatedReceipt= repository.findOne(id);

        Assert.assertEquals(545,updatedReceipt.getId());
    }

    @Test
    public void testDelete() throws Exception
    {
        Receipt receipt= repository.findOne(id);
        repository.delete(receipt);
        Receipt newReceipt= repository.findOne(id);

        Assert.assertNull(newReceipt);
    }



}
