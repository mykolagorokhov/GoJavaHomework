package modul05.task055;

import modul05.task051.Room;

import modul05.task057.Main;

import java.util.Arrays;

/**
 * Created by MYKOLA.GOROKHOV on 22.02.2017.
 * <p>
 * Создать интерфейс DAO и его реализацию. Методы выводят название операции и объекта, над которым она произведена.
 * Room save(Room room)
 * boolean delete(Room room)
 * Room update(Room room)
 * Room findById(long id)
 */
public class DAOimpl implements DAO {

    public Room[] roomDB = new Room[10];

    public void save(Room room) {
        int count = getRoomsCount(roomDB);
        roomDB[count] = room;
    }

    private int getRoomsCount(Room[] roomDB) {
        int count = 0;
        for (int i = 0; i < roomDB.length; i++) {
            if (roomDB[i] != null) {
                count++;
            }
        }
        return count;
    }

    public boolean delete(Room room) {
        System.out.println(room.getId() + " was deleted");

        for (int i = 0; i < roomDB.length; i++) {
            Room roomInDb = roomDB[i];
            if (room.equals(roomInDb)) {
                System.arraycopy(roomDB, i + 1, roomDB, i, roomDB.length - i - 1);
                roomDB[roomDB.length - 1] = null;
            }
        }
        return true;
    }

    public Room update(Room room) {
        Room room2 = new Room(room.getId(), room.getPrice(), room.getPersons(), room.getDateAvailableFrom(), room.getHotelName(), room.getCityName());
        return room2;
    }

    public Room findById(long id) {
        for (Room room : roomDB) {
            if (room != null && room.getId() == id) {
                return room;
            }
        }
        return null;
    }

    public Room[] getRoomDB() {
        return roomDB;
    }
}
