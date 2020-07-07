package sessions.classes_objects.inheritance.problem;
//Inheritance
//HighAchiever is a subclass(child) of Student
//Student is a super(parent) class of HighAchiever
public class HighAchiever extends Student {
    //every constructor's first statement is
    //either a call to super class constructor(super())
    //or call to a diff constructor within the same class
    //using this().
    //if no super() or this() with any params declared explicitly, super()(empty params) is being called
    private double gpa;
    public HighAchiever(String name, int rollNo, double gpa) {
        //all instance variables declared in the super class
        //we need to initialize using super()
        //super is a call to a direct parent class constructor
        super(name,6);
        //extra, unique properties of the subclass must be initialized the standard way after super()
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }



}
