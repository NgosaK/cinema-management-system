package za.ac.cput.ngosa.repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.ngosa.domain.Schedule;

/**
 * Created by User on 2015/05/03.
 */
public interface ScheduleRepository extends CrudRepository<Schedule,Long> {

    public Schedule findByCode(String code);
}
