package za.ac.cput.ngosa.repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.ngosa.domain.TVShow;

/**
 * Created by User on 2015/05/03.
 */
public interface TVShowRepository extends CrudRepository<TVShow,Long> {

    public TVShow findByCode(String code);

}
