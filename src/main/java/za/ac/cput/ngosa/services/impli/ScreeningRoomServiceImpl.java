package za.ac.cput.ngosa.services.impli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.ngosa.domain.ScreeningRoom;
import za.ac.cput.ngosa.repository.ScreeningRoomRepository;
import za.ac.cput.ngosa.services.ScreeningRoomService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2015/05/03.
 */
@Service
public class ScreeningRoomServiceImpl implements ScreeningRoomService {

    @Autowired
    ScreeningRoomRepository repository;

    @Override
    public List<ScreeningRoom> getScreeningRooms() {
        List<ScreeningRoom> allScreeningRooms= new ArrayList<ScreeningRoom>();
        Iterable<ScreeningRoom> screeningRooms= repository.findAll();

        for(ScreeningRoom screeningRoom: screeningRooms)
        {
            allScreeningRooms.add(screeningRoom);
        }


        return allScreeningRooms;
    }
}
