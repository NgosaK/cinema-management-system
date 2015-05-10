package za.ac.cput.ngosa.confFactoryTest;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.ngosa.conf.factory.MovieFactory;
import za.ac.cput.ngosa.conf.factory.ReceiptFactory;
import za.ac.cput.ngosa.domain.Movie;
import za.ac.cput.ngosa.domain.Receipt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by User on 2015/05/09.
 */
public class ReceiptFactoryTest extends TestCase {

    @Test
    public void testCreateReceipt() throws Exception {

        Map<String, String> values = new HashMap<String, String>();
        List<Movie> movies= new ArrayList<Movie>();


        values.put("cashierName", "Jerry");
        values.put("item","large popcorn");

        Receipt receipt= ReceiptFactory.createReceipt(values, 60.00,5, movies,444);
        Assert.assertEquals(444, receipt.getId());
    }

    @Test
    public void testUpdateReceipt()  throws Exception
    {
        Map<String,String> values= new HashMap<String,String>();
        List<Movie> movies= new ArrayList<Movie>();


        values.put("cashierName", "Jerry");
        values.put("item","large popcorn");

        Receipt receipt= ReceiptFactory.createReceipt(values, 60.00,5, movies, 444);


        Receipt newReceipt= new Receipt
                .Builder()
                .copy(receipt)
                .build();

        Assert.assertEquals("Jerry",newReceipt.getCashierName());
        Assert.assertEquals("large popcorn",newReceipt.getItem());
        Assert.assertEquals(444,newReceipt.getId());
        Assert.assertEquals(60.00,newReceipt.getPrice(),0.01);
        Assert.assertEquals(5,newReceipt.getQuantity());
        Assert.assertEquals(300.00,newReceipt.getTotal(),0.01);
    }

}
