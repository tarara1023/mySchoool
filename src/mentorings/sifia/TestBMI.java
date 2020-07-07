package mentorings.sifia;

public class TestBMI {
    public static void main(String[] args) {
        BMI yulia = new BMI("Yulia",24, 1.59, 45);
        System.out.println(yulia.getBMI());
        System.out.println(yulia.getStatus());
        System.out.printf("Your BMI is %f, and you are - %s, and you are %d person, who check it", yulia.getBMI(), yulia.getStatus(),BMI.counter);

    }
}
