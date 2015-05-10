package za.ac.cput.ngosa.services.impli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.ngosa.domain.Beverage;
import za.ac.cput.ngosa.repository.BeverageRepository;
import za.ac.cput.ngosa.services.BeverageService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2015/05/03.
 */
@Service
public class BeverageServiceImpl implements BeverageService {
@Autowired
  private  BeverageRepository repository;

    public List<Beverage> getBeverages() {

        List<Beverage> allDrinks= new ArrayList<Beverage>();
        Iterable<Beverage> beverages = repository.findAll();

        for(Beverage beverage: beverages)
        {
            allDrinks.add(beverage);
        }
        return allDrinks;
    }
}
