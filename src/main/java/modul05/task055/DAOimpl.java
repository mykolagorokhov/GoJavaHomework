package modul05.task055;

import modul05.task051.Room;

import modul05.task057.Main;

import java.util.Arrays;
import java.util.Date;

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

    public Room[] roomDB = new Room[16];

    public void save(Room room) {
        int i = -1;
        do {
            i++;
        } while (roomDB[i] != null);
        roomDB[i] = room;

        System.out.print("Room " + roomDB[i].toString());
        System.out.println(" was added to DB with index: " + i);
    }

    public boolean delete(Room room) {

        Room[] tempRoom = new Room[roomDB.length];
        int count = -1;
        for (int i = 0; i < roomDB.length; i++) {
            if (roomDB[i] != null && roomDB[i].getId() != room.getId()) {
                count++;
                tempRoom[count] = roomDB[i];
            }
        }

        roomDB = Arrays.copyOf(tempRoom, tempRoom.length);

        System.out.println("Updated array");
        for (int i = 0; i < roomDB.length; i++) {
            if (roomDB[i] != null) {
                System.out.println((i + 1) + ". " + roomDB[i].toString());
            }
        }

        if (roomDB[0] == null) {
            System.out.println("Array are empty");
            return false;
        } else {
            return true;
        }
    }


    public Room update(Room room) {
        Room room2 = new Room(room.getId(), room.getPrice(), room.getPersons(), room.getDateAvailableFrom(), room.getHotelName(), room.getCityName());
        return room2;
    }

    public Room findById(long id) {
        for (Room room : roomDB) {
            if (room != null && room.getId() == id) {
                System.out.println("room was found: " + room.toString());
                return room;
            }
        }
        return null;
    }

    public Room[] getAll() {
        System.out.println("getRoomDB:");
        for (int i = 0; i < roomDB.length; i++) {
            if (roomDB[i] != null) {
                System.out.println((i + 1) + ". " + roomDB[i].toString());
            }
        }
        return roomDB;
    }
}
