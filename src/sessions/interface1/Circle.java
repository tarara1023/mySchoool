package sessions.interface1;

public class Circle implements Shape {
   private double radius;
   private String name;
   private String color;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public Circle(double radius, String name, String color) {
        this.radius = radius;
        this.name = name;
        this.color = color;

    }


    public double calculateArea() {
        return Math.sqrt(radius)*Math.PI;
    }


    public void printShapeName() {
        System.out.println(name);
    }


    public void setColor(String color) {
       this.color = color;
    }
}
