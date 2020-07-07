package sessions.interface1;

public interface Shape {

    //it has to be static because we cant create object from
    // interface and we need straight ecsses

    public static final String welcomeMessage = "Hello";

    //public abstract -> are implicitly places before methods


    /**
     * calculate area of the shape
     * @return
     */
     double calculateArea();

    /**
     * print name of the shape
     */
    void printShapeName();

    /**
     * all shapes must have color
     * so the color should be able to be changes via this method
     * @param color
     */

    void setColor(String color);





}
