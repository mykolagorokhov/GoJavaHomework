package modul05.task056;

import modul05.task051.Room;
import modul05.task053.API;
import modul05.task054.BookingComAPI;

/**
 * Created by MYKOLA.GOROKHOV on 22.02.2017.
 * <p>
 * TASK 6
 * Create Controller class. It contains global variable
 * API apis[] = new API[3];
 * which contains all impelentations of API interface.
 * Also, controller contains two methods
 * Room[] requstRooms(int price, int persons, String city, String hotel)
 * which finds all the rooms with requested params. Method use all apis available to make search.
 * Found rooms create to DB
 * Room[] check(API api1, API api2)
 * Chech how many the same rooms two different apis return
 */
public class Controller {
    API apis[] = new API[3];

    //  apis[].BookingComAPI;
    public Room[] requstRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }

    public Room[] check(API api1, API api2) {
        return new Room[0];
    }


}
