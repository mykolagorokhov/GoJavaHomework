package modul05.task054;

import modul05.task051.Room;
import modul05.task053.API;
import modul05.task055.DAOimpl;


import java.util.Arrays;
import java.util.Date;

/**
 * Created by MYKOLA.GOROKHOV on 22.02.2017.
 */
public class GoogleAPI implements API {
    Room[] roomsGAPI = new Room[5];

    public GoogleAPI() {
        roomsGAPI[0] = new Room(11, 400, 1, new Date(), "Google", "Kiev");
        roomsGAPI[1] = new Room(12, 500, 1, new Date(), "Google", "Kiev");
        roomsGAPI[2] = new Room(13, 600, 1, new Date(), "Google", "Kiev");
        roomsGAPI[3] = new Room(14, 700, 1, new Date(), "Google", "Kiev");
        roomsGAPI[4] = new Room(15, 800, 1, new Date(), "Google", "Kiev");
    }

    public Room[] findRooms(int price, int persons, String city, String hotel) {
        System.out.println("Google try to found:");
        System.out.println(
                "Price: " + price +
                        "; Peresons: " + persons +
                        "; City: " + city +
                        "; Hotel: " + hotel +
                        ".");

        Room[] dataBase = new Room[roomsGAPI.length];
        Room tempRoom = new Room(0, price, persons, new Date(), hotel, city);

        int count = -1;
        for (int i = 0; i < roomsGAPI.length; i++) {
            if (tempRoom.equals(roomsGAPI[i])) {
                count++;
                dataBase[count] = roomsGAPI[i];
                System.out.print("Google was found: ");
                System.out.println(dataBase[count].toString());
            }
        }
        if (dataBase[0] == null) {
            System.out.println("Google was NOT found");
        }
        return dataBase;
    }

    public Room[] getRooms() {
        return roomsGAPI;
    }
}
