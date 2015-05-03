package za.ac.cput.ngosa.conf.factory;


import za.ac.cput.ngosa.domain.ScreeningRoom;

import java.util.List;
import java.util.Map;
/**
 * Created by User on 2015/05/01.
 */
public class ScreeningRoomFactory {

    public static ScreeningRoom createManager(
            Map<String,String>values, int size,int id)
    {
        ScreeningRoom screeningRoom=new ScreeningRoom
                .Builder()
                .type(values.get("type"))
                .size(size)
                .numberID(id)
                .build();

        return screeningRoom;
    }
}
