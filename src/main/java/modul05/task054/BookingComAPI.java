package modul05.task054;

import modul05.task051.Room;
import modul05.task053.API;

import modul05.task055.DAOimpl;

import javax.xml.crypto.Data;
import java.util.Date;


/**
 * Created by MYKOLA.GOROKHOV on 22.02.2017.
 * TASK 4
 * Create three implementations of API called: BookingComAPI, TripAdvisorAPI, GoogleAPI. Every implementation has global
 * variable Room[] rooms which must be initialized in empty constructor with 5 differentRooms.
 */
public class BookingComAPI implements API {
    Room[] roomsBCAPI = new Room[5];

    public BookingComAPI() {
        roomsBCAPI[0] = new Room(1, 100, 1, new Date(), "Book", "Kiev");
        roomsBCAPI[1] = new Room(2, 200, 1, new Date(), "Book", "Kiev");
        roomsBCAPI[2] = new Room(3, 200, 1, new Date(), "Book", "Kiev");
        roomsBCAPI[3] = new Room(4, 400, 1, new Date(), "Book", "Kiev");
        roomsBCAPI[4] = new Room(5, 500, 1, new Date(), "Book", "Kiev");
    }

    public Room[] findRooms(int price, int persons, String city, String hotel) {
        System.out.println("BookingCom try to found:");
        System.out.println(
                "Price: " + price +
                        "; Peresons: " + persons +
                        "; City: " + city +
                        "; Hotel: " + hotel +
                        ".");

        Room[] dataBase = new Room[roomsBCAPI.length];
        Room tempRoom = new Room(0, price, persons, new Date(), hotel, city);

        int count = -1;
        for (int i = 0; i < roomsBCAPI.length; i++) {
            if (tempRoom.equals(roomsBCAPI[i])) {
                count++;
                dataBase[count] = roomsBCAPI[i];
                System.out.print("BookingCom was found: ");
                System.out.println(dataBase[count].toString());
            }
        }
        if (dataBase[0] == null) {
            System.out.println("BookingCom was NOT found");
        }
        return dataBase;
    }

    public Room[] getRooms() {
        return roomsBCAPI;
    }


}
