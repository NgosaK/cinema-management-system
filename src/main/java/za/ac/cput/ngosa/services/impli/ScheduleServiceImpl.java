package za.ac.cput.ngosa.services.impli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.ngosa.domain.Schedule;
import za.ac.cput.ngosa.repository.ScheduleRepository;
import za.ac.cput.ngosa.services.ScheduleService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2015/05/03.
 */
@Service
public class ScheduleServiceImpl implements ScheduleService {
    @Autowired
    ScheduleRepository repository;

    @Override
    public List<Schedule> getSchedules() {

        List<Schedule> allSchedules= new ArrayList<Schedule>();
        Iterable<Schedule> schedules= repository.findAll();

        for(Schedule schedule: schedules)
        {
            allSchedules.add(schedule);
        }

        return null;
    }
}
