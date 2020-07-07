package sessions.classes_objects.car;

public class CarShop {

    public static void main(String[] args) {
        Engine car1Eng = new Engine(800, 10, "LaFerrari");
        Car car1 = new Car("Ferrari", "LaFerrari", car1Eng);

        System.out.println((car1.getMake()));
        System.out.println(car1.getEngine().getEngineHorsPower());
        //we can create object in param
        //when we dont need to reuse the object in this scope
        Car car2 = new Car("Rolls Roys", "Phantom", new Engine(600, 8, "pht"));

    }
}
