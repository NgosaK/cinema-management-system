package za.ac.cput.ngosa.conf.factory;

import za.ac.cput.ngosa.domain.Movie;
import za.ac.cput.ngosa.domain.Receipt;
import java.util.List;
import java.util.Map;

/**
 * Created by User on 2015/05/01.
 */
public class ReceiptFactory {

    public static Receipt createReceipt(
            Map<String,String>values, double price,int quantity,List<Movie> movies,
    long id)
    {
        Receipt receipt= new Receipt
                .Builder()
                .id(id)
                .item(values.get("item"))
                .price(price)
                .quantity(quantity)
                .total()
                .cashierName(values.get("cashierName"))
                .movieTitle(movies)
                .build();

        return receipt;

    }

}
