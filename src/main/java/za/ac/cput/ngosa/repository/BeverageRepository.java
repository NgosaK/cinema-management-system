package za.ac.cput.ngosa.repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.ngosa.domain.Beverage;

/**
 * Created by User on 2015/05/03.
 */
public interface BeverageRepository extends CrudRepository<Beverage,Integer> {

  //  public Beverage findByCode(String code);
}
