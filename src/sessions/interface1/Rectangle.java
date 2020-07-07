package sessions.interface1;

public class Rectangle implements Shape {

    private double width;
    private double length;
    private String name;
    private String color;

    public Rectangle(double width, double length, String name, String color) {
        setWidth(width);
        setLength(length);
        this.name = name;
        this.color = color;
    }

    public double calculateArea() {
      return width*length;
     }
       public void printShapeName() {
           System.out.println(name);
      }

      public void setColor(String color) {
       this.color = color;
      }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width > 0)
        this.width = width;
        else System.out.println("negative number");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length>0)
        this.length = length;
        else System.out.println("negative number");
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
}
