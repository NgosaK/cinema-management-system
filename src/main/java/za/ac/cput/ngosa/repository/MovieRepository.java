package za.ac.cput.ngosa.repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.ngosa.domain.Movie;

/**
 * Created by User on 2015/05/03.
 */
public interface MovieRepository extends CrudRepository<Movie,Long> {

    public Movie findByCode(String code);
}
