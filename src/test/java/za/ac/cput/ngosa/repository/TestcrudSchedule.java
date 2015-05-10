package za.ac.cput.ngosa.repository;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import za.ac.cput.ngosa.App;
import za.ac.cput.ngosa.domain.Schedule;

/**
 * Created by User on 2015/05/10.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class TestcrudSchedule extends AbstractTestNGSpringContextTests {

    private  long id;

    @Autowired
    private ScheduleRepository repository;

    @Test
    public void testCreate() throws Exception{

        Schedule schedule= new Schedule.Builder()
                .duration(2)
                .startTime(14)
                .title("9")
                .id(485)
                .endTime()
                .build();

        repository.save(schedule);
        id= schedule.getId();

        Assert.assertNotNull(schedule.getId());
    }

    @Test
    public void testRead() throws Exception
    {
        Schedule schedule= repository.findOne(id);

        Assert.assertEquals(485,schedule.getId());
    }

    @Test
    public void testUpdate() throws Exception{
        Schedule newSchedule= new Schedule.Builder()
                .id(885)
                .build();

        repository.save(newSchedule);
        id= newSchedule.getId();
        Schedule updatedSchedule= repository.findOne(id);

    }

    @Test
    public void testDelete() throws Exception
    {
        Schedule schedule= repository.findOne(id);
        repository.delete(schedule);
        Schedule newSchedule= repository.findOne(id);

        Assert.assertNull(newSchedule);
    }

}



