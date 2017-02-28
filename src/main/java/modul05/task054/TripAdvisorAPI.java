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

    DAOimpl roomDAO = new DAOimpl();

    public Room[] getRooms() {
        Room[] rooms = roomDAO.getRoomDB().clone();
        return rooms;
    }

    public TripAdvisorAPI() {
        for (int i = 0; i < 5; i++) {
            Room room = new Room(i + 20, (i + 7) * 100, 1, new Date(), "Some", "Kyiv");
            roomDAO.save(room);
        }
    }

    public Room[] findRooms(int price, int persons, String city, String hotel) {

        System.out.println("TripAdvisor try to found:");
        System.out.println(
                "Price: " + price +
                        "; Peresons: " + persons +
                        "; City: " + city +
                        "; Hotel: " + hotel +
                        ".");

        Room[] dataBase = new Room[5];
        Room[] rooms = roomDAO.getRoomDB().clone();
        int count = -1;
        for (int i = 0; i < 5; i++) {
            if (rooms[i].getPrice() == price && rooms[i].getPersons() == persons && rooms[i].getCityName() == city && rooms[i].getHotelName() == hotel) {
                count++;
                dataBase[count] = rooms[i];
                System.out.println("TripAdvisor was found:");

                System.out.println(
                        "ID: " + dataBase[count].getId() +
                                "; Price: " + dataBase[count].getPrice() +
                                "; Peresons: " + dataBase[count].getPersons() +
                                "; City: " + dataBase[count].getCityName() +
                                "; Hotel: " + dataBase[count].getHotelName() +
                                ".");
            }
        }
        if (dataBase[0] == null) {
            System.out.println("TripAdvisor was NOT found");
        }
        return dataBase;
    }
}
