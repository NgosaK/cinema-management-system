package za.ac.cput.ngosa.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.ngosa.domain.Beverage;
import za.ac.cput.ngosa.services.BeverageService;

import javax.validation.groups.ConvertGroup;
import java.util.List;

/**
 * Created by User on 2015/05/03.
 */
@RestController
@RequestMapping("/api/**")
public class HomePage {
    @Autowired
    private BeverageService service;
    @RequestMapping(value="home", method= RequestMethod.GET)
    public String Index()
    {
        return "This is the home page";
    }

    @RequestMapping(value = "/beverage", method = RequestMethod.GET)
    public Beverage getBeverage()
    {
        Beverage beverage= new Beverage.Builder().name("kick")
                .code(4839).category("energy").price(15.00)
                .volume(500).build();

        return beverage;
    }

    @RequestMapping(value = "/beverages",method = RequestMethod.GET)
    public List<Beverage> getBeverages(){
        return  service.getBeverages();
    }

}
