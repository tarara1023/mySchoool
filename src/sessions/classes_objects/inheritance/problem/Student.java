package sessions.classes_objects.inheritance.problem;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;


public class Student {
    private String name;
    private int rollNo;
    //grades is a property specific to hight perfoming students
    private List<String> grades;
    public static int lastStudentna;
    public  static Set<Integer> setRollNumber = new HashSet<>();

//    public Student() {
//
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }


    public Student(String name) {
        this.name = name;

        if(!setRollNumber.contains(this.rollNo)) {
            this.rollNo = lastStudentna++;

        }
        else {
            this.rollNo = lastStudentna++;
            System.out.println(rollNo + " the given ID is not available. " + this.rollNo + " is assigned");
        }
        setRollNumber.add(rollNo);

    }




    public Student(String name, int rollNo) {
        this.name = name;
        if (rollNo < lastStudentna || setRollNumber.contains(rollNo)) {
            this.rollNo = lastStudentna++;
            System.out.println(rollNo + " the given ID is not available. " + this.rollNo + " is assigned");
        }
        else this.rollNo = rollNo;

        setRollNumber.add(rollNo);

    }

//        lastStudentna++;
//        if (setRollNumber.contains(rollNo)) {
//            this.rollNo = lastStudentna++;
//
//        }
//        else
//            this.rollNo = rollNo;

public int solveAMultiplication(int num1,int num2){
        return num1*num2;
        }
        }
