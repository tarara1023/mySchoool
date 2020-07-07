package homeworks.methods;

public class Methods {

    public static void main(String[] args) {
        Methods rectangle = new Methods();
        rectangle.areaAndPerimetersOfARectangle(12,8);
        rectangle.areaAndPerimetersOfARectangle(6, 10);
        rectangle.areaAndPerimetersOfARectangle(32, 29);

    }

    public void areaAndPerimetersOfARectangle(int length, int width) {

        int area = length * width;
        int perimeter = (length + width) * 2;

        System.out.println("The area of a Rectangle is " + area);
        System.out.println("The perimeter of a Rectangle is " + perimeter);

    }
}
