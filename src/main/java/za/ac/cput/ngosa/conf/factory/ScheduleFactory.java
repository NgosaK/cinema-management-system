package za.ac.cput.ngosa.conf.factory;

import za.ac.cput.ngosa.domain.Schedule;

import java.util.List;
import java.util.Map;
/**
 * Created by User on 2015/05/01.
 */
public class ScheduleFactory {

    public static Schedule createManager(
            Map<String,String>values, int duration, long
            id, int startTime)
    {
        Schedule schedule= new Schedule
                .Builder()
                .endTime()
                .id(id)
                .title(values.get("title"))
                .duration(duration)
                .startTime(startTime)
                .build();

        return schedule;
    }

}
