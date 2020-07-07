package sessions.interface1;

public class ShapePlayer {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(10,20, "Rectangle", "Yellow");

        System.out.println(rec.calculateArea());
         rec.printShapeName();
        Shape recI = new Rectangle(5, 9, "Rectangle", "Red");
        System.out.println(recI.calculateArea());
        recI.printShapeName();
    }
}
