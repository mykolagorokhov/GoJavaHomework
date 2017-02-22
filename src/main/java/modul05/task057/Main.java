package modul05.task057;

import modul05.task051.Room;
import modul05.task054.BookingComAPI;
import modul05.task054.GoogleAPI;
import modul05.task054.TripAdvisorAPI;

import java.lang.reflect.Array;
import java.util.Date;

import static modul05.task054.GoogleAPI.rooms;



/**
 * Created by MYKOLA.GOROKHOV on 22.02.2017.
 */
public class Main {
    public static void main(String[] args) {

       BookingComAPI bcapi1 = new BookingComAPI();
       GoogleAPI gapi1 = new GoogleAPI();
        TripAdvisorAPI taapi1 = new TripAdvisorAPI();
       // System.out.println( bcapi1);


   //    Room r1 = new Room(0, 1, 1, new Date(), "2", "1");
    //    Room r2 = new Room(0, 1, 1, new Date(), "1", "1");


//        Room[] dataBase = new Room[4];
//
//        dataBase[0]= new Room(1, 1, 1, new Date(), "2", "1");
//        dataBase[1]= new Room(2, 1, 1, new Date(), "2", "1");
//        dataBase[2]= new Room(3, 1, 1, new Date(), "2", "1");
//        dataBase[3]= new Room(4, 1, 1, new Date(), "2", "1");
//        dataBase[4]= new Room(5, 1, 1, new Date(), "2", "1");


        System.out.println(bcapi1.rooms[0].equals(bcapi1.rooms[1]));
        System.out.println(gapi1.rooms[2].hashCode()+ "  -  "+gapi1.rooms[3].hashCode());

        System.out.println(taapi1.findRooms(3,1,"1","3")[0].getId());

    }

}
