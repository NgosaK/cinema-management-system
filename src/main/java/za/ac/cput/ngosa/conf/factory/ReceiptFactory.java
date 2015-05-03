package za.ac.cput.ngosa.conf.factory;

import za.ac.cput.ngosa.domain.Movie;
import za.ac.cput.ngosa.domain.Receipt;
import java.util.List;
import java.util.Map;

/**
 * Created by User on 2015/05/01.
 */
public class ReceiptFactory {

    public static Receipt createManager(
            Map<String,String>values, double price,List<Movie> movies,
    long id, int quantity)
    {
        Receipt receipt= new Receipt
                .Builder()
                .id(id)
                .price(price)
                .quantity(quantity)
                .cashierName(values.get("cashierName"))
                .total()
                .movieTitle(movies)
                .build();

        return receipt;

    }

}
