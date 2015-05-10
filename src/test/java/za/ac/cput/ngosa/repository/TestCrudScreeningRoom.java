package za.ac.cput.ngosa.repository;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import za.ac.cput.ngosa.App;
import za.ac.cput.ngosa.domain.ScreeningRoom;

/**
 * Created by User on 2015/05/10.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class TestCrudScreeningRoom extends AbstractTestNGSpringContextTests {

    private int id;

    @Autowired
    private ScreeningRoomRepository repository;

    @Test
    public void testCreate() throws Exception{

        ScreeningRoom screeningRoom= new ScreeningRoom.Builder()
                .numberID(345)
                .size(235)
                .type("3D")
                .build();

        repository.save(screeningRoom);
        id= screeningRoom.getNumberID();

        Assert.assertNotNull(screeningRoom.getNumberID());
    }

    @Test
    public void testRead() throws Exception
    {
        ScreeningRoom screeningRoom= repository.findOne(id);

        Assert.assertEquals(345,screeningRoom.getNumberID());
    }

    @Test
    public void testUpdate() throws Exception
    {
        ScreeningRoom newScreeningRoom= new ScreeningRoom.Builder()
                .numberID(586)
                .build();

        repository.save(newScreeningRoom);

        id= newScreeningRoom.getNumberID();
        ScreeningRoom updatedScreeningRoom= repository.findOne(id);

        Assert.assertEquals(586,updatedScreeningRoom.getNumberID());

    }

    @Test
    public void testDelete() throws Exception{
        ScreeningRoom screeningRoom= repository.findOne(id);
        repository.delete(screeningRoom);

        ScreeningRoom newScreeningRoom= repository.findOne(id);

        Assert.assertNull(newScreeningRoom);
    }

}
