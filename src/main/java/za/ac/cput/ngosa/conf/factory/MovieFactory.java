package za.ac.cput.ngosa.conf.factory;

import za.ac.cput.ngosa.domain.Movie;
import java.util.List;
import java.util.Map;

/**
 * Created by User on 2015/05/01.
 */
public class MovieFactory {

    public static Movie createMovie(
            Map<String,String>values, double price, long
            id) {
        Movie movie = new Movie
                .Builder()
                .price(price)
                .type(values.get("type"))
                .id(id)
                .genre(values.get("genre"))
                .duration(values.get("duration"))
                .title(values.get("title"))
                .build();

        return movie;
    }
}
