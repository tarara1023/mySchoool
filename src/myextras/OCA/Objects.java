package myextras.OCA;

import static myextras.OCA.Student.*;
public class Objects {
    private static Student student = new Student();
    private static Student student1 = new Student();
    {
       System.out.println(student.length);
    }

    public static void main(String[] args) {
        student.length = 9;
        student1.length = 8;
        System.out.println(student.length);
    }

}
