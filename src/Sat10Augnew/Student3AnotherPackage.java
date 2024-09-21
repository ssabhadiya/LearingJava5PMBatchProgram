package Sat10Augnew;

import Sat10Aug.Student;

public class Student3AnotherPackage {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sandip";
        s1.rollno = 102;
        s1.address = "India";
        s1.displayedData();
//
//        new Student().name = "Sandip k";
//        new Student().rollno = 101;
//        new Student().address = "Gujarat";
//        new Student().displayedData();

    }
}
