package modul05.task054;

import modul05.task051.Room;
import modul05.task053.API;

import java.util.Date;

/**
 * Created by MYKOLA.GOROKHOV on 22.02.2017.
 * TASK 4
 * Create three implementations of API called: BookingComAPI, TripAdvisorAPI, GoogleAPI. Every implementation has global
 * variable Room[] rooms which must be initialized in empty constructor with 5 differentRooms.
 */
public class BookingComAPI implements API {



       public static Room[] rooms = {
                new Room(0, 1, 1, new Date(), "1", "1"),
                new Room(1, 1, 1, new Date(), "1", "1"),
                new Room(2, 1, 1, new Date(), "1", "1"),
                new Room(3, 1, 1, new Date(), "1", "1"),
                new Room(4, 1, 1, new Date(), "1", "1")};





    public Room[] findRooms(int price, int persons, String city, String hotel) {


        return new Room[0];
    }


}
