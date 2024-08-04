package org.example;

class Student {
    int rollno;//instance variable
    String name;
    static String college = "ITS";//static variable

    //constructor
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    public Student() {

    }

    //method to display the values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
/*package org.example;

public class Student {
    String name;
    int rollno;
    static String college = "Amrita";

    Student(int r, String n) {
        rollno = r;
        name = n;

        Void display() {
            System.out.println(name + " " + rollno + " " + college);

        }
    }


}*/

