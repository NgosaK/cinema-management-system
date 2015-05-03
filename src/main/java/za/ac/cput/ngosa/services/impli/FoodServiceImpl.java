package za.ac.cput.ngosa.services.impli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.ngosa.domain.Food;
import za.ac.cput.ngosa.repository.FoodRepository;
import za.ac.cput.ngosa.services.FoodService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2015/05/03.
 */
@Service
public class FoodServiceImpl implements FoodService {
    @Autowired
    FoodRepository repository;

    @Override
    public List<Food> getFood() {

        List<Food> allFood= new ArrayList<Food>();
        Iterable<Food> foods= repository.findAll();

        for(Food food: foods)
        {
            allFood.add(food);
        }
        return allFood;
    }
}
