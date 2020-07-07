package mentorings;

public class LoopsSum {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <=10; i++) {
            sum += i;
            System.out.printf("%d + %d = %d%n", sum, i, sum + i);

        }
        System.out.println(sum);

    }
}
