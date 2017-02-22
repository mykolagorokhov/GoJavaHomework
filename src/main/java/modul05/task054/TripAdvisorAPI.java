package modul05.task054;

import modul05.task051.Room;
import modul05.task053.API;

import java.util.Date;

/**
 * Created by MYKOLA.GOROKHOV on 22.02.2017.
 */
public class TripAdvisorAPI implements API {


    public static Room[] rooms = {
            new Room(0, 1, 1, new Date(), "3", "1"),
            new Room(1, 2, 1, new Date(), "3", "1"),
            new Room(2, 3, 1, new Date(), "3", "1"),
            new Room(3, 4, 1, new Date(), "3", "1"),
            new Room(4, 5, 1, new Date(), "3", "1")};


    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int i;
        Room[] rrr = new Room[1];


        for (i = 0; i < rooms.length - 1; i++) {
            if (rooms[i].getPrice() == price && rooms[i].getPersons() == persons && rooms[i].getCityName() == city && rooms[i].getHotelName() == hotel) {

                System.out.println("findRooms");
                //Room[] rrr = new Room[1];
                rrr[0] = rooms[i];
                break;
            } else {
                continue;
                //System.out.println("ERROR - findRooms");


            }
        }


        return rrr;
    }
}
