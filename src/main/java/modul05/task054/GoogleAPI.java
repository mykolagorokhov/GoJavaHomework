package modul05.task054;

import modul05.task051.Room;
import modul05.task053.API;

import java.util.Date;

/**
 * Created by MYKOLA.GOROKHOV on 22.02.2017.
 */
public class GoogleAPI implements API {


   public static       Room[] rooms = {
                new Room(0, 1, 1, new Date(), "2", "1"),
                new Room(1, 1, 1, new Date(), "2", "1"),
                new Room(2, 1, 1, new Date(), "2", "1"),
                new Room(3, 1, 1, new Date(), "2", "1"),
                new Room(4, 1, 1, new Date(), "2", "1")};





    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
}
