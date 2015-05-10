package za.ac.cput.ngosa.confFactoryTest;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.ngosa.conf.factory.ScheduleFactory;
import za.ac.cput.ngosa.conf.factory.ScreeningRoomFactory;
import za.ac.cput.ngosa.domain.Schedule;
import za.ac.cput.ngosa.domain.ScreeningRoom;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 2015/05/09.
 */
public class ScreeningRoomFactoryTest extends TestCase {

    @Test
    public void testCreateScreeningRoom() throws Exception {

        Map<String, String> values = new HashMap<String, String>();


        values.put("type", "IMAX 3D");

        ScreeningRoom screeningRoom = ScreeningRoomFactory.createScreeningRoom(values, 250, 674);
        Assert.assertEquals("IMAX 3D", screeningRoom.getType());
    }

    @Test
    public void testUpdateScreeningRoom() throws Exception {
        Map<String, String> values = new HashMap<String, String>();


        values.put("type", "IMAX 3D");

        ScreeningRoom screeningRoom = ScreeningRoomFactory.createScreeningRoom(values, 250, 674);


        ScreeningRoom newScreeningRoom = new ScreeningRoom
                .Builder()
                .copy(screeningRoom)
                .build();

        Assert.assertEquals("IMAX 3D", newScreeningRoom.getType());
        Assert.assertEquals(674, newScreeningRoom.getNumberID());
        Assert.assertEquals(250, newScreeningRoom.getSize());
    }
}
