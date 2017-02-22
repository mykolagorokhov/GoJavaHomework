package modul05.task053;

import modul05.task051.Room;

/**
 * Created by MYKOLA.GOROKHOV on 22.02.2017.
 * <p>
 * TASK  3
 * Create API interface which contains one method
 * Room[] findRooms(int price, int persons, String city, String hotel)
 */
public interface API {

    Room[] findRooms(int price, int persons, String city, String hotel);

}
