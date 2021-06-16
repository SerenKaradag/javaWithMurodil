package day54_abstraction;

public class School {
    public static void main(String[] args) {
      // Student student = new Student();   // ERROR - CAN NOT CREATE OBJECT OF STUDENT
       //student.attendClass();

        OnlineStudent onlineStudent = new OnlineStudent();
        onlineStudent.attendClass();

        CampusStudent campusStudent = new CampusStudent();
        campusStudent.attendClass();


    }
}
