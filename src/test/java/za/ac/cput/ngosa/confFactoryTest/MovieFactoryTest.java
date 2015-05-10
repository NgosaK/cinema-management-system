package za.ac.cput.ngosa.confFactoryTest;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.ngosa.conf.factory.ManagerFactory;
import za.ac.cput.ngosa.conf.factory.MovieFactory;
import za.ac.cput.ngosa.domain.Manager;
import za.ac.cput.ngosa.domain.Movie;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 2015/05/09.
 */
public class MovieFactoryTest extends TestCase {

    @Test
    public void testCreateMovie() throws Exception {

        Map<String, String> values = new HashMap<String, String>();


        values.put("type", "3D");
        values.put("genre", "drama");
        values.put("duration", "1hr 56min");
        values.put("title", "The perks of being a wallflower");
        Movie movie= MovieFactory.createMovie(values, 60.00, 674);
        Assert.assertEquals("drama", movie.getGenre());
    }

    @Test
    public void testUpdateMovie()  throws Exception
    {
        Map<String,String> values= new HashMap<String,String>();

        values.put("type", "3D");
        values.put("genre", "drama");
        values.put("duration", "1hr 56min");
        values.put("title", "The perks of being a wallflower");

        Movie movie= MovieFactory.createMovie(values, 60.00, 674);


        Movie newMovie= new Movie
                .Builder()
                .copy(movie)
                .build();

        Assert.assertEquals("3D",newMovie.getType());
        Assert.assertEquals("drama",newMovie.getGenre());
        Assert.assertEquals(674,newMovie.getId());
        Assert.assertEquals("1hr 56min",newMovie.getDuration());
        Assert.assertEquals(60.00,newMovie.getPrice(),0.01);
        Assert.assertEquals("The perks of being a wallflower",newMovie.getTitle());
    }

}
