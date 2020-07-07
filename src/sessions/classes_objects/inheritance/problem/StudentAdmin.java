package sessions.classes_objects.inheritance.problem;

import tests.testNG.SecondTestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentAdmin {
    public static void main(String[] args) {
        HighAchiever johnDoe = new HighAchiever("John Doe", 2, 4.0);

        System.out.println(johnDoe.getName());
        System.out.println("COnstructor with rollNo: " + johnDoe.getRollNo());
//        System.out.println(johnDoe.getGpa());
//        System.out.println(johnDoe.solveAMultiplication(2,5));
        //Student objects will not have gpa bc, student class doesnt extend anything, so it will only have what it has
        Student student = new Student("Elon", 1);
        System.out.println("COnstructor with rollNo: " + student.getRollNo());
        Student student1 = new Student("Steve");
        System.out.println(student1.getRollNo());//2
        Student student2 = new Student("Elen", 5);
        System.out.println("COnstructor with rollNo: "+ student2.getRollNo());//
        Student student3 = new Student("Elen");
        System.out.println(student3.getRollNo());//
        Student student4 = new Student("Elen");
        System.out.println(student4.getRollNo());//
        Student student5 = new Student("Elen", 7);
        System.out.println("COnstructor with rollNo: " + student5.getRollNo());//
        Student student9 = new Student("Elen", 8);
        System.out.println("COnstructor with rollNo: " + student9.getRollNo());//
        Student student10 = new Student("Elen");
        System.out.println(student10.getRollNo());//3
        Student student11 = new Student("Elen");
        System.out.println(student11.getRollNo());//3
        Student student12 = new Student("Elen",2);
        System.out.println("COnstructor with rollNo: "+ student12.getRollNo());//
        Student student13 = new Student("Elen", 8);
        System.out.println("COnstructor with rollNo: " + student13.getRollNo());//

        List<String> lits = new ArrayList<>(Arrays.asList("Apple", "Tomatoes", "Banana"));
        for (String ele: lits) {
            if(ele.equals("Apple"))
                System.out.println(ele);

        }

    }

}
