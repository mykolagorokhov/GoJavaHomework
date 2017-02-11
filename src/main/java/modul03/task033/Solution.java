package modul03.task033;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by MYKOLA.GOROKHOV on 10.02.2017.
 */

public class Solution {
    //******************MAIN******************************
    public static void main(String[] args) {

        SimpleDateFormat ft =
                new SimpleDateFormat("yyyy.MM.dd");


        Course course1 = new Course(new Date(), "Java1");
        Course course2 = new Course(new Date(), "Java2");
        Course course3 = new Course(new Date(), "SoftSkill");
        Course course4 = new Course(10, "Java", "Teacher1");
        Course course5 = new Course(20, "SoftSkill", "Teacher2");
        System.out.println("Course 1");
        System.out.println("Date = " + ft.format(course1.getStartDate()) + "; Name = " + course1.getName());
        System.out.println();
        System.out.println("Course 2");
        System.out.println("Date = " + ft.format(course2.getStartDate()) + "; Name = " + course2.getName());
        System.out.println();
        System.out.println("Course 3");
        System.out.println("Date = " + ft.format(course3.getStartDate()) + "; Name = " + course3.getName());
        System.out.println();
        System.out.println("Course 4");
        System.out.println("Duration = " + course4.getHoursDuration() + "; Name = " + course4.getName() + "; teacher Name= " + course4.getTeacherName());
        System.out.println();
        System.out.println("Course 5");
        System.out.println("Duration = " + course5.getHoursDuration() + "; Name = " + course5.getName() + "; teacher Name= " + course5.getTeacherName());


        Course[] coursesTaken = {course1, course2, course5};


        Student student1 = new Student("FN", "LN", 1);
        Student student2 = new Student("LN", coursesTaken);
        System.out.println();
        System.out.println("student1");
        System.out.println("FN = " + student1.getFirstName() + "; LN=  " + student1.getLastName() + "; group= " + student1.getGroup());

        System.out.println();
        System.out.println("student2");
        System.out.print("LN=  " + student2.getLastName());
        System.out.print("; CourseTaken= ");
        for (int i = 0; i < coursesTaken.length; i++) {
            System.out.print(student2.getCoursesTaken()[i].getName() + " ");
        }
        System.out.println();


        CollegeStudent collegeStudent1 = new CollegeStudent("FN", "LN", 1);
        CollegeStudent collegeStudent2 = new CollegeStudent("LN", coursesTaken);
        CollegeStudent collegeStudent3 = new CollegeStudent("FN", "LN", 2,
                "CN", 100, 123465);

        System.out.println();
        System.out.println("CollegeStudent1");
        System.out.println("FN = " + collegeStudent1.getFirstName() + "; LN=  " + collegeStudent1.getLastName() + "; group= " + collegeStudent1.getGroup());
        System.out.println();
        System.out.println("CollegeStudent2");
        System.out.print("LN=  " + collegeStudent2.getLastName());
        System.out.print("; CourseTaken= ");
        for (int i = 0; i < coursesTaken.length; i++) {
            System.out.print(collegeStudent2.getCoursesTaken()[i].getName() + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("CollegeStudent3");
        System.out.println(
                "firstName=" + collegeStudent3.getFirstName() + "; lastName= " + collegeStudent3.getLastName() + "; group= "
                        + collegeStudent3.getGroup() + "; collegeName= " + collegeStudent3.getCollegeName() +
                        "; rating= " + collegeStudent3.getRating() + "; id= " + collegeStudent3.getId());


        SpecialStudent specialStudent1 = new SpecialStudent("FN", "LN", 2,
                "CN", 100, 123465);
        SpecialStudent specialStudent2 = new SpecialStudent("FN", "LN", 1);
        SpecialStudent specialStudent3 = new SpecialStudent("FN", "LN", 3, "CN",
                99, 321654, 1111);
        System.out.println();
        System.out.println("specialStudent1");
        System.out.println(
                "firstName=" + specialStudent1.getFirstName() + "; lastName= " + specialStudent1.getLastName() + "; group= "
                        + specialStudent1.getGroup() + "; collegeName= " + specialStudent1.getCollegeName() +
                        "; rating= " + specialStudent1.getRating() + "; id= " + specialStudent1.getId());
        System.out.println();
        System.out.println("specialStudent2");
        System.out.println("FN = " + specialStudent2.getFirstName() + "; LN=  " + specialStudent2.getLastName() + "; group= " + specialStudent2.getGroup());
        System.out.println();
        System.out.println("specialStudent3");
        System.out.println(
                "firstName=" + specialStudent3.getFirstName() + "; lastName= " + specialStudent3.getLastName() + "; group= "
                        + specialStudent3.getGroup() + "; collegeName= " + specialStudent3.getCollegeName() +
                        "; rating= " + specialStudent3.getRating() + "; id= " + specialStudent3.getId() + "; secretKey= " +
                        specialStudent3.getSecretKey());


    }
//****************************************************


}
