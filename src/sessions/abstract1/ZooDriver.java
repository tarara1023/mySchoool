package sessions.abstract1;

public class ZooDriver {

    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.eat();
        System.out.println(horse.getAge());
    }
}
