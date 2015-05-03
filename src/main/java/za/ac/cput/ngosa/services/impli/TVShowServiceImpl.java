package za.ac.cput.ngosa.services.impli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.ngosa.domain.TVShow;
import za.ac.cput.ngosa.repository.TVShowRepository;
import za.ac.cput.ngosa.services.TVShowService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2015/05/03.
 */
@Service
public class TVShowServiceImpl implements TVShowService {

    @Autowired
    TVShowRepository repository;

    @Override
    public List<TVShow> getTVShows() {

        List<TVShow> allTVShows= new ArrayList<TVShow>();
        Iterable<TVShow> tvShows= repository.findAll();

        for(TVShow tvShow: tvShows)
        {
            allTVShows.add(tvShow);
        }
        return allTVShows;
    }
}
