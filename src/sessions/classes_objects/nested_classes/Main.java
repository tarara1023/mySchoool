package sessions.classes_objects.nested_classes;

public class Main {
    public static void main(String[] args) {
        Apartment ap = new Apartment();
        Apartment.Room room = ap.new Room();

        Building.Builder buil = new Building.Builder(2,3);
    }
}
