
package entity;

import java.util.ArrayList;

/**
 *
 * @author ABDUL MOIZ
 */
public class Enrollment {
    public static ArrayList<Student> stud;
    public static Course course;

    public Enrollment() {
        stud=new ArrayList();
        course=new Course();
    }
public static void EnrollNow(Student s1,Course c1){
    Enrollment.course =c1;
   Enrollment.stud.add(s1);
   
}
    
    
    
    
    
    public static ArrayList<Student> getStud() {
        return stud;
    }

    public static void setStud(ArrayList<Student> stud) {
        Enrollment.stud = stud;
    }

    public static Course getCourse() {
        return course;
    }

    public static void setCourse(Course course) {
        Enrollment.course = course;
    }
    
}
