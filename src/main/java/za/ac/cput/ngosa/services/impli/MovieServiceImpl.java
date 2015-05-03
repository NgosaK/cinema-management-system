package za.ac.cput.ngosa.services.impli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.ngosa.domain.Movie;
import za.ac.cput.ngosa.repository.MovieRepository;
import za.ac.cput.ngosa.services.MovieService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2015/05/03.
 */
@Service
public class MovieServiceImpl implements MovieService{
    @Autowired
    MovieRepository repository;

    @Override
    public List<Movie> getMovies() {

        List<Movie> allMovies= new ArrayList<Movie>();
        Iterable<Movie> movies= repository.findAll();

        for(Movie movie: movies)
        {
            allMovies.add(movie);
        }

        return allMovies;
    }
}
