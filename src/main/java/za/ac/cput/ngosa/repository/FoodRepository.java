package za.ac.cput.ngosa.repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.ngosa.domain.Food;

/**
 * Created by User on 2015/05/03.
 */
public interface FoodRepository extends CrudRepository<Food,Integer> {

    public Food findByCode(String code);
}
