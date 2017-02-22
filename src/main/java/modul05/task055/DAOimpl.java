package modul05.task055;

import modul05.task051.Room;
import modul05.task057.Main;

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

    public Room save(Room room) {
        System.out.println(room.getId() + " was saved");
        return null;
    }

    public boolean delete(Room room) {
        System.out.println(room.getId() + " was deleted");
        return false;
    }

    public Room update(Room room) {
        System.out.println(room.getId() + " was updated");
        return null;
    }

    public Room findById(long id) {
      //  for (int i = 0; Main.main();)

        //System.out.println(room.getId()+" was findById");
        return null;
    }
}
