package za.ac.cput.ngosa.conf.factory;

import za.ac.cput.ngosa.domain.TVShow;

import java.util.Map;

/**
 * Created by User on 2015/05/01.
 */
public class TvShowFactory {

    public static TVShow createTVShow(
            Map<String,String> values, long id,double price)
    {
        TVShow tvShow= new TVShow
                .Builder()
                .title(values.get("title"))
                .season(values.get("season"))
                .price(price)
                .genre(values.get("genre"))
                .duration(values.get("duration"))
                .id(id)
                .build();

        return tvShow;
    }
}
