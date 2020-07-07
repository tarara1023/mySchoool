package sessions.collections.arrays;

public class ArraysInitializaionInLoops {

    public static void main(String[] args) {

        int [] evenNumbers = new int[50];
        int count = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                evenNumbers[count] = i;
                count++;
            }

        }
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.println(evenNumbers[i]);
        }
        }

    }

