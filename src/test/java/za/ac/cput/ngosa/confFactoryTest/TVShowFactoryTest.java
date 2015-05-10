package za.ac.cput.ngosa.confFactoryTest;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.ngosa.conf.factory.MovieFactory;
import za.ac.cput.ngosa.conf.factory.TvShowFactory;
import za.ac.cput.ngosa.domain.Movie;
import za.ac.cput.ngosa.domain.TVShow;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 2015/05/09.
 */
public class TVShowFactoryTest extends TestCase {

    @Test
    public void testCreateMovie() throws Exception {

        Map<String, String> values = new HashMap<String, String>();


        values.put("season", "2");
        values.put("genre", "fantasy");
        values.put("duration", "1hr");
        values.put("title", "Game of thrones");
        TVShow tvShow= TvShowFactory.createTVShow(values,674,60.00);
        Assert.assertEquals("fantasy", tvShow.getGenre());
    }

    @Test
    public void testUpdateMovie()  throws Exception
    {
        Map<String, String> values = new HashMap<String, String>();


        values.put("season", "2");
        values.put("genre", "fantasy");
        values.put("duration", "1hr");
        values.put("title","Game of thrones");
        TVShow tvShow= TvShowFactory.createTVShow(values, 674, 60.00);


        TVShow newTVShow= new TVShow
                .Builder()
                .copy(tvShow)
                .build();


        Assert.assertEquals("fantasy",newTVShow.getGenre());
        Assert.assertEquals(674,newTVShow.getId());
        Assert.assertEquals("1hr",newTVShow.getDuration());
        Assert.assertEquals(60.00,newTVShow.getPrice(),0.01);
        Assert.assertEquals("Game of thrones",newTVShow.getTitle());
    }
}
