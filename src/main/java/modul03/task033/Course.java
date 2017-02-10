package modul03.task033;


/**
 * Created by MYKOLA.GOROKHOV on 08.02.2017.
 * <p>
 * You need to create following structure of the classes.
 * <p>
 * Class Course with fields:
 * Date startDate,
 * String name,
 * int hoursDuration,
 * String teacherName.
 * <p>
 * Create two constructors with fields
 * startDate, name; and
 * hourseDuration, name, teacherName.
 * *******************
 * Class Student with fields:
 * String firstName,
 * String lastName,
 * int group,
 * Course[] coursesTaken,
 * int age.
 * <p>
 * With 2 constructors
 * firstName, lastName, group; and
 * lastName, coursesTaken.
 * *********************
 * CollegeStudent that is a child of Student.
 * With additional fields:
 * String collegeName,
 * int rating,
 * long id.
 * <p>
 * Create three constructors:
 * two the same as in Student
 * and one with all the fields of the class.
 * ***********************
 * Class SpecialStudent that is child of CollegeStudent.
 * With additional fields
 * long secretKey,
 * String email.
 * <p>
 * Create three constructors:
 * two the same as in CollegeStudend
 * and one with secretKey field.
 * <p>
 * Create getters and setters for all fields and make fields private as OOP principle follows.
 * Create 5 objects Course class.
 * Create objects of others classes using every constructor. You must have 13 objects in Solution class.
 */

// Про библЯотеки могли бы и намекнуть !!!

import java.util.Date;

public class Course {
    private Date startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;

    public Course(Date startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }

    public Course(int hoursDuration, String name, String teacherName) {
        this.name = name;
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

}
