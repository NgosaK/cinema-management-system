package za.ac.cput.ngosa.repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.ngosa.domain.ScreeningRoom;

/**
 * Created by User on 2015/05/03.
 */
public interface ScreeningRoomRepository extends CrudRepository<ScreeningRoom,Integer> {

    public ScreeningRoom findByCode(String code);
}
