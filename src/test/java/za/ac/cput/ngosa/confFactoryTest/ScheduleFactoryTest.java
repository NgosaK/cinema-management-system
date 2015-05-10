package za.ac.cput.ngosa.confFactoryTest;

import junit.framework.Assert;
import org.junit.Test;
import za.ac.cput.ngosa.conf.factory.MovieFactory;
import za.ac.cput.ngosa.conf.factory.ReceiptFactory;
import za.ac.cput.ngosa.conf.factory.ScheduleFactory;
import za.ac.cput.ngosa.domain.Movie;
import za.ac.cput.ngosa.domain.Receipt;
import za.ac.cput.ngosa.domain.Schedule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by User on 2015/05/09.
 */
public class ScheduleFactoryTest {

    @Test
    public void testCreateMovie() throws Exception {

        Map<String, String> values = new HashMap<String, String>();


        values.put("title", "mad max");

        Schedule schedule = ScheduleFactory.createSchedule(values, 2, 674, 12);
        Assert.assertEquals("mad max", schedule.getTitle());
    }

    @Test
    public void testUpdateReceipt() throws Exception {
        Map<String, String> values = new HashMap<String, String>();


        values.put("title", "mad max");

        Schedule schedule = ScheduleFactory.createSchedule(values, 2, 674, 12);


        Schedule newSchedule = new Schedule
                .Builder()
                .copy(schedule)
                .build();

        Assert.assertEquals("mad max", newSchedule.getTitle());
        Assert.assertEquals(674, newSchedule.getId());
        Assert.assertEquals(12, newSchedule.getStartTime());
        Assert.assertEquals(14, newSchedule.getEndTime());
        Assert.assertEquals(2, newSchedule.getDuration());
    }

}
