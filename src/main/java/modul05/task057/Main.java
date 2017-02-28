package modul05.task057;

import modul05.task051.Room;
import modul05.task054.BookingComAPI;
import modul05.task054.GoogleAPI;
import modul05.task054.TripAdvisorAPI;
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

        System.out.println("\u001B[31m"); //red
        bcapi1.findRooms(500, 1, "Kyiv", "Some");
        System.out.println("\u001B[32m"); //green
        gapi1.findRooms(300, 1, "Kyiv", "Some");
        System.out.println("\u001B[33m"); //yellow
        taapi1.findRooms(100000, 1, "Kyiv", "Some");

        Controller cont1 = new Controller();

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
