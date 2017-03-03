package modul05.task056;

import modul05.task051.Room;
import modul05.task053.API;
import modul05.task054.BookingComAPI;
import modul05.task054.GoogleAPI;
import modul05.task054.TripAdvisorAPI;
import modul05.task055.DAO;
import modul05.task055.DAOimpl;


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

    DAO dao = new DAOimpl();

    {
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    public void save(Room room) {
        dao.save(room);
    }

    public boolean delete(Room room) {
        return dao.delete(room);
    }

    public Room update(Room room) {
        return dao.update(room);
    }

    public Room findById(long id) {
        return dao.findById(id);
    }

    public Room[] getAll() {
        return dao.getAll();
    }


    public Room[] requstRooms(int price, int persons, String city, String hotel) {
        Room[] requst1 = apis[0].findRooms(price, persons, city, hotel);
        Room[] requst2 = apis[1].findRooms(price, persons, city, hotel);
        Room[] requst3 = apis[2].findRooms(price, persons, city, hotel);
        Room[] result = new Room[30];

        int count = -1;
        for (int i = 0; i < requst1.length; i++) {
            if (requst1[i] != null) {
                count++;
                result[count] = requst1[i];
            }
        }

        for (int i = 0; i < requst2.length; i++) {
            if (requst2[i] != null) {
                count++;
                result[count] = requst1[i];
            }
        }

        for (int i = 0; i < requst3.length; i++) {
            if (requst3[i] != null) {
                count++;
                result[count] = requst1[i];
            }
        }
        return result;
    }

    public Room[] check(API api1, API api2) {
        Room[] result = new Room[10];
        System.out.println("------same Room:------------");
        int count = -1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (api1.getRooms()[i].equals(api2.getRooms()[j]) && api1.getRooms()[i] != null && api2.getRooms()[i] != null) {
                    count++;
                    result[count] = api1.getRooms()[i];
                    count++;
                    result[count] = api2.getRooms()[j];

                    System.out.println(result[count - 1].toString());
                    System.out.println(result[count].toString());
                }
            }
        }
        return result;
    }
}
