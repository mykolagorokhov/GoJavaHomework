package modul05.task057;

import modul05.task051.Room;
import modul05.task054.BookingComAPI;
import modul05.task054.GoogleAPI;
import modul05.task054.TripAdvisorAPI;
import modul05.task055.DAO;
import modul05.task055.DAOimpl;
import modul05.task056.Controller;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;


/**
 * Created by MYKOLA.GOROKHOV on 22.02.2017.
 */
public class Main {

    public static void main(String[] args) {
        BookingComAPI bcapi1 = new BookingComAPI();
        GoogleAPI gapi1 = new GoogleAPI();
        TripAdvisorAPI taapi1 = new TripAdvisorAPI();
        Controller cont1 = new Controller();

        System.out.println("Save:\u001B[33m"); //yellow
        cont1.save(new Room(1, 1, 1, new Date(), "1", "1"));
        cont1.save(new Room(2, 1, 1, new Date(), "1", "1"));
        cont1.save(new Room(3, 1, 1, new Date(), "1", "1"));
        cont1.save(new Room(4, 1, 1, new Date(), "1", "1"));
        cont1.save(new Room(5, 1, 1, new Date(), "1", "1"));
        cont1.save(new Room(6, 1, 1, new Date(), "1", "1"));
        cont1.save(new Room(7, 1, 1, new Date(), "1", "1"));
        cont1.save(new Room(8, 1, 1, new Date(), "1", "1"));
        cont1.save(new Room(9, 1, 1, new Date(), "1", "1"));

        System.out.println("\u001B[0m"); //reset
        System.out.println("Delete:\u001B[31m"); //red
        cont1.delete(new Room(3, 1, 1, new Date(), "1", "1"));

        System.out.println("\u001B[0m"); //reset
        System.out.println("Find By Id:\u001B[32m"); //green
        cont1.findById(4);

        System.out.println("\u001B[0m"); //reset
        System.out.println("Get All:\u001B[33m"); //yellow
        cont1.getAll();

        System.out.println("\u001B[0m"); //reset
        System.out.println("Controller Test");

        System.out.println("\u001B[31m"); //red
        cont1.requstRooms(400, 1, "Kyiv", "Some");

        System.out.println("\u001B[33m"); //yellow
        cont1.check(bcapi1, gapi1);

        System.out.println("\u001B[32m"); //green
        cont1.check(gapi1, taapi1);

        System.out.println("\u001B[31m"); //red
        cont1.check(bcapi1, taapi1);
    }
}
