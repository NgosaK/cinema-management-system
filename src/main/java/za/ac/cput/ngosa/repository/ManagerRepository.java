package za.ac.cput.ngosa.repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.ngosa.domain.Manager;

/**
 * Created by User on 2015/05/03.
 */
public interface ManagerRepository extends CrudRepository<Manager,Long> {

    public Manager findByCode(String code);
}
