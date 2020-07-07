package sessions.loops;

public class OptionalLabels {

    public static void main(String[] args) {

        //print out hello 10 times, skip 7
        //optional label - name of the loop
        // we can use the label after continue and break
        //statements to specify which exact loop we want to apply continue or break;

        hello: for (int i = 0; i < 10; i++) {
                    if (i == 7) {
                        continue hello;
                    }
            System.out.println(i);

        }

        num: for (int i = 1; i < 100; i++) {
                if ( i % 13 == 0) {
                System.out.println(i);
                 break num;
                }
        }
    }
}
