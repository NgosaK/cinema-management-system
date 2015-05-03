package za.ac.cput.ngosa.conf.factory;

import za.ac.cput.ngosa.domain.Food;

/**
 * Created by User on 2015/05/01.
 */
import java.util.List;
import java.util.Map;
public class FoodFactory {

    public static Food createFood(
            Map<String,String>values, int code, double
            price, double weight)
    {
        Food food=new Food
                .Builder()
                .price(price)
                .code(code)
                .name(values.get("name"))
                .weight(weight)
                .category(values.get("category"))
                .build();

        return food;

    }
}
