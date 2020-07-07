package myextras.newboston;

public class apples {
    public static void main(String[] args) {


        tuna tunaObject = new tuna();
        tuna tunaObject2 = new tuna(5);
        tuna tunaObject3 = new tuna(5,13);
        tuna tunaObject4 = new tuna(5,13,43);

        System.out.printf("%s\n", tunaObject.toMilitary());
        System.out.printf("%s\n", tunaObject2.toMilitary());
        System.out.printf("%s\n", tunaObject3.toMilitary());
        System.out.printf("%s\n", tunaObject4.toMilitary());


        potpie potpieObject = new potpie(4, 5, 6);
        tuna2 tuna2Object = new tuna2("Greg", potpieObject);

        System.out.println(tuna2Object);

        for (tunaEnum people: tunaEnum.values()) {
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
        }


    }
}
