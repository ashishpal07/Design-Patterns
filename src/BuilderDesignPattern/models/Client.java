package BuilderDesignPattern.models;

import BuilderDesignPattern.models.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Student student = Student.getBuilder()
                .setAge(19)
                .setAttendance((double) 88)
                .setBatch("July 24")
                .setGender("Male")
                .setName("Ashish")
                .setId((long) 1)
                .setPsp((double) 98).build();

        student.studentDetails();
    }
}