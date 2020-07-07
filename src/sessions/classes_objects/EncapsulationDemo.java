package sessions.classes_objects;

public class EncapsulationDemo {

    public static void main(String[] args) {


        Animal demo = new Animal("Dog", "Labrador", 2, 0, 'M', 9, false);
        Animal demo2 = new Animal("Dog", "Labrador", 2, 0, 'M', 9, true);

        System.out.println(demo.getType());
        System.out.println(demo.isInjured());
        demo.heal();
        System.out.println(demo.isInjured());

        System.out.println(demo2.getType());
        System.out.println(demo2.isInjured());
        demo2.heal();
        System.out.println(demo2.isInjured());

        demo.run(4);
        System.out.println(demo.getWeight());
        System.out.println(demo);

        System.out.println(demo.getDurationByTime());

    }
}
