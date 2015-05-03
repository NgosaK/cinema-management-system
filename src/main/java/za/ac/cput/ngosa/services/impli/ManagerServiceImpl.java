package za.ac.cput.ngosa.services.impli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.ngosa.domain.Manager;
import za.ac.cput.ngosa.repository.ManagerRepository;
import za.ac.cput.ngosa.services.ManagerService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2015/05/03.
 */
@Service
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    ManagerRepository repository;

    @Override
    public List<Manager> getManagers() {

        List<Manager> allManagers= new ArrayList<Manager>();
        Iterable<Manager> managers= repository.findAll();

        for(Manager manager: managers)
        {
            allManagers.add(manager);
        }
        return allManagers;
    }
}
