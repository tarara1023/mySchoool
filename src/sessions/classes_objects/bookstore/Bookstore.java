package sessions.classes_objects.bookstore;

public class Bookstore {

    public static void main(String[] args) {
        Autore isaacson = new Autore("Walter Isaacson", "Writes great bios about greats of the past like Franklin and Einstein", 70, ":)");
        //if you have classes defined in params -> in order to use the method or constructor
        //we need to create an object of that class and pass the reference to that object.
        Autore Osho = new Autore("Osho", "Tarot Zen", 80, ":)");
        Book bioOfFranklin = new Book("Creator of American Character", 1000, true, false, isaacson);
        System.out.println("Number of book Issacson: " + bioOfFranklin.getAutore().getNumBooks());
        Book bioOfEinstein = new Book("Einstein Bio", 222, true, false, isaacson);
        System.out.println("Number of book Issacson: " + bioOfEinstein.getAutore().getNumBooks());
        Book bioOfFranvk = new Book("Creator of American Character", 1000, true, false, isaacson);
        System.out.println("Number of book Issacson: " + bioOfFranvk.getAutore().getNumBooks());
        Book oshoo1 = new Book("Creator of American Character", 1000, true, false, Osho);
        System.out.println("Number of book Osho: " + oshoo1.getAutore().getNumBooks());
        System.out.println("Number of book Osho: " + oshoo1.getAutore().getNumBooks());
        Book oshoo2 = new Book("Creator of American Character", 1000, true, false, Osho);
        System.out.println("Number of book Osho: " + oshoo2.getAutore().getNumBooks());
        System.out.println(isaacson.getName());
        System.out.println(bioOfFranklin.getTitle());
        System.out.println(bioOfFranklin.getAutore().getName());
        //show me books by Walter Isaacson
        if (bioOfFranklin.getAutore().getName().equalsIgnoreCase("Walter Isaacson")) {
            System.out.println(bioOfFranklin.getTitle());
        }
        //HW
        //1)Write a method(happyBirthDay) in Author class it should increment the author's age.
        System.out.println(isaacson.getAge());
        isaacson.happyBirthDay();
        System.out.println(isaacson.getAge());
    }
}
