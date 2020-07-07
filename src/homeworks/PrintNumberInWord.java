package homeworks;

import java.util.Scanner;

public class PrintNumberInWord {

    public static void main(String[] args) {

        int number = 9;  // Set the value of "number" here!

        // Using nested-if
        if (number >= 1) {// Use == for comparison
            System.out.println("ONE");
            if (number >= 2) {
                System.out.println("TWO");
                if (number >= 3) {
                    System.out.println("THREE");
                    if (number >= 4) {
                        System.out.println("FOUR");
                        if (number >= 5) {
                            System.out.println("FIVE");
                            if (number >= 6) {
                                System.out.println("SIX");
                                if (number >= 7) {
                                    System.out.println("SEVEN");
                                    if (number >= 8) {
                                        System.out.println("EIGHT");
                                        if (number == 9) {
                                            System.out.println("NINE");
                                        } else {
                                            System.out.println("OTHER");
                                        }
                                    }
                                }
                            }
                        }
                    }

                }

            }

        }
    }

}

class PrintNumberInWordSwitch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String word = "";

        switch (number) {
            case 1:
                word = "ONE";
                System.out.println(word);
                break;
            case 2:
                word = "TWO";
                System.out.println(word);
                break;
            case 3:
                word = "THREE";
                System.out.println(word);
                break;
            case 4:
                word = "FOUR";
                System.out.println(word);
                break;
            case 5:
                word = "FIVE";
                System.out.println(word);
                break;
            case 6:
                word = "SIX";
                System.out.println(word);
                break;
            case 7:
                word = "SEVEN";
                System.out.println(word);
                break;
            case 8:
                word = "EIGHT";
                System.out.println(word);
                break;
            case 9:
                word = "NINE";
                System.out.println(word);
                break;
            default:
                word = "OTHER";
                System.out.println(word);



        }
    }

}