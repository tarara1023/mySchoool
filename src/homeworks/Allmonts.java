package homeworks;

public class Allmonts {

    public static void main(String[] args) {

        String[] MONTHS = {
                "", "Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };
        int m = 3;
        for (int i = 0; i < MONTHS.length; i++) {
            if (i == m)
                System.out.println(MONTHS[m]);

        }


    }
}
