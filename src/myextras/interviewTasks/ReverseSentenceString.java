package myextras.interviewTasks;

public class ReverseSentenceString {

    public static void main(String[] args) {

        String sentence = "Java is fun";
        String reversed ="";
        String [] arr = sentence.split(" ");
        for ( int i = arr.length-1; i>=0; i--) {
            reversed = arr[i] + "";
            if (i == 0) {
                System.out.println(reversed);
            } else {
                System.out.println(reversed + "");
            }
        }
    }

    }

