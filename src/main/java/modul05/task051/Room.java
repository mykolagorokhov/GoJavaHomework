package modul05.task051;

/**
 * Created by MYKOLA.GOROKHOV on 22.02.2017.
 * <p>
 * TASK 1
 * Class Room should contain fields
 * long id
 * int price
 * int persons
 * Date dateAvailableFrom
 * String hotelName
 * String cityName
 * Generate getters and setters. And create constructor with all fields.
 * <p>
 * TASK 2
 * Override equals and hashCode methods. Rooms are equal when price, persons and cityName are equal.
 */

import java.util.Date;
import java.text.SimpleDateFormat;

public class Room {

//    public SimpleDateFormat sdf =
//            new SimpleDateFormat("yyyy.MM.dd");

    private long id;
    private int price;
    private int persons;
    private Date dateAvailableFrom;
    private String hotelName;
    private String cityName;

   // @Override
    public boolean equals(Room obj) {
        // Rooms are equal when price, persons and cityName are equal.
        if (this.price == obj.getPrice() &&
                this.persons == obj.getPersons() &&
                this.cityName == obj.getCityName()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
       return Integer.parseInt( this.price+this.persons+this.cityName);
                //super.hashCode();
    }

    public Room(long id, int price, int persons, Date dateAvailableFrom, String hotelName, String cityName) {
        this.id = id;
        this.price = price;
        this.persons = persons;
        this.dateAvailableFrom = dateAvailableFrom;
        this.hotelName = hotelName;
        this.cityName = cityName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public Date getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public void setDateAvailableFrom(Date dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
