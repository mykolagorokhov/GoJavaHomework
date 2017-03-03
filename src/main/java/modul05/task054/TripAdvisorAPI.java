package modul05.task054;

import modul05.task051.Room;
import modul05.task053.API;
import modul05.task055.DAOimpl;
import modul05.task057.Main;


import java.util.Arrays;
import java.util.Date;

/**
 * Created by MYKOLA.GOROKHOV on 22.02.2017.
 */
public class TripAdvisorAPI implements API {

    Room[] roomsTAAPI = new Room[5];

    public TripAdvisorAPI() {
        roomsTAAPI[0] = new Room(21, 800, 1, new Date(), "TripAdvisor", "Kiev");
        roomsTAAPI[1] = new Room(22, 900, 1, new Date(), "TripAdvisor", "Kiev");
        roomsTAAPI[2] = new Room(23, 200, 1, new Date(), "TripAdvisor", "Kiev");
        roomsTAAPI[3] = new Room(24, 300, 1, new Date(), "TripAdvisor", "Kiev");
        roomsTAAPI[4] = new Room(25, 400, 1, new Date(), "TripAdvisor", "Kiev");
    }

    public Room[] findRooms(int price, int persons, String city, String hotel) {
        System.out.println("TripAdvisor try to found:");
        System.out.println(
                "Price: " + price +
                        "; Peresons: " + persons +
                        "; City: " + city +
                        "; Hotel: " + hotel +
                        ".");

        Room[] dataBase = new Room[roomsTAAPI.length];
        Room tempRoom = new Room(0, price, persons, new Date(), hotel, city);

        int count = -1;
        for (int i = 0; i < roomsTAAPI.length; i++) {
            if (tempRoom.equals(roomsTAAPI[i])) {
                count++;
                dataBase[count] = roomsTAAPI[i];
                System.out.print("TripAdvisor was found: ");
                System.out.println(dataBase[count].toString());
            }
        }
        if (dataBase[0] == null) {
            System.out.println("TripAdvisor was NOT found");
        }
        return dataBase;
    }

    public Room[] getRooms() {
        return roomsTAAPI;
    }
}
