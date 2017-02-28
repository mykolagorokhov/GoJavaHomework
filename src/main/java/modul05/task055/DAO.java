package modul05.task055;

import modul05.task051.Room;

/**
 * Created by MYKOLA.GOROKHOV on 22.02.2017.
 * <p>
 * Create DAO interface and its implementation. Methods print operation name and object which was used.
 * Room save(Room room)
 * boolean delete(Room room)
 * Room update(Room room)
 * Room findById(long id)
 */
public interface DAO {

  void save(Room room);
  boolean delete(Room room);
  Room update(Room room);
  Room findById(long id);
}
