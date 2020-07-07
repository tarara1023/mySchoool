package sessions.classes_objects.nested_classes;

public class Apartment {
    String number;
    public class Room{
        String roomsiz;
    }
}
class Building{
    int levels;
    int area;
    public static class Builder {
        public Builder(int levels, int area) {
            System.out.println(area);
        }
    }
}
class Main2 {
    public static void main(String[] args) {

        Apartment ap = new Apartment();
        Apartment.Room room = ap.new Room();

        Building.Builder buil = new Building.Builder(2, 3);
    }
}
