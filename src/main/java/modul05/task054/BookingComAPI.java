package modul05.task054;

import modul05.task051.Room;
import modul05.task053.API;

import modul05.task055.DAOimpl;

import java.util.Date;

/**
 * Created by MYKOLA.GOROKHOV on 22.02.2017.
 * TASK 4
 * Create three implementations of API called: BookingComAPI, TripAdvisorAPI, GoogleAPI. Every implementation has global
 * variable Room[] rooms which must be initialized in empty constructor with 5 differentRooms.
 */
public class BookingComAPI implements API {

    DAOimpl roomDAO = new DAOimpl();

    public BookingComAPI() {
        for (int i = 0; i < 5; i++) {
            Room room = new Room(i + 1, (i + 1) * 100, 1, new Date(), "Some", "Kyiv");
            roomDAO.save(room);
        }
    }

    public Room[] getRooms() {
        Room[] rooms = roomDAO.getRoomDB().clone();
        return rooms;
    }

    public Room[] findRooms(int price, int persons, String city, String hotel) {
        System.out.println("BookingCom try to found:");
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
                System.out.println("BookingCom was found:");

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
            System.out.println("BookingCom was NOT found");
        }
        return dataBase;
    }
}
