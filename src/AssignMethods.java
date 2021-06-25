import java.io.*;
import java.util.*;

/*
 * This is a simple bit of code that creates instances of a Teacher
 * and TeachersAssistant class, adds a course, and determines if the
 * course is complete. The code performs as expected. Please refactor
 * this bit of code for the next five-ten minutes and explain your
 * reasoning. The goal is to get this code production-ready.
 */

class Solution {
    public static void main(String[] args) {
        //Setting up
        Course course = new Course();
        course.setName("Math");
        course.setIsGraded(true);

        Teacher teacher = new Teacher();
        TeachersAssistant teachersAssistant = new TeachersAssistant();
        teacher.assignCourse(course);
        teachersAssistant.assignCourse(course);

        System.out.println(teachersAssistant.isCourseGraded("Math"));
    }
}

class TeacherCommon{
    String name = "";
    String username = "";
    String password = "";

}

class Teacher extends TeacherCommon implements AssignMethods{


    List<Course> courses = new ArrayList<Course>();

    public boolean assignCourse(Course course) {
        return courses.add(course);
    }
}

class TeachersAssistant extends TeacherCommon implements AssignMethods{

    List<Course> courses = new ArrayList<Course>();

    public boolean isCourseGraded(String courseName) {
        boolean isGraded = false;
        for(Course course : courses) {
            if (course.getName().equals(courseName)) {
                isGraded = course.getIsGraded();
            }
        }
        return isGraded;
    }

    public boolean assignCourse(Course course) {
        return courses.add(course);
    }
}

class Course {
    String name = "";
    boolean isGraded = false;

    public boolean getIsGraded() {
        return isGraded;
    }

    public void setIsGraded(boolean isGraded) {
        this.isGraded = isGraded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public interface AssignMethods {

    public boolean assignCourse(Course course);

}