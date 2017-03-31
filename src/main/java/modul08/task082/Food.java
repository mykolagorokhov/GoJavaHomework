package modul08.task082;

import modul08.task081.Country;
import modul08.task081.IdGenerator;

/**
 * Created by MYKOLA.GOROKHOV on 24.03.2017.
 * <p>
 * ДЗ №08.2
 * Создайте класс Food со следующими полями:
 * id (уникальный идентификатор товара)
 * name (наименование товара)
 * country (страна производитель)
 * expiration (срок годности в днях)
 * Реализуйте доступ к полям. Идентификатор id должен быть недоступен
 * для изменения и генерироваться с помощью IdGenerator при создании товара.
 * Товары считаются одинаковыми, если их id одинаковы. Переопределите методы
 * hashCode и equals соответственно.
 */
public class Food {

    public long id;
    public String name;
    public Country country;
    public long expiration;


    public Food(String name, Country country, long expiration) {
        this.name = name;
        this.country = country;
        this.expiration = expiration;
        this.id =  IdGenerator.generate ( name,  country, expiration);
    }

    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public long getExpiration() {
        return expiration;
    }

    public void setExpiration(long expiration) {
        this.expiration = expiration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Food food = (Food) o;

        return id == food.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country=" + country +
                ", expiration=" + expiration +
                '}';
    }
}
