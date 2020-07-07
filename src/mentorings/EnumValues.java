package mentorings;

public class EnumValues {

    enum Colors {
        RED, PINK, BlUE, GREEN;
        public void getColors() {
            System.out.println(Colors.BlUE);
        }
    }

    public static void main (String [] args) {
        System.out.println(Colors.BlUE);
       Colors clr = Colors.BlUE;
       clr.getColors();
        switch (clr) {
            case GREEN:
                System.out.println("Color is green");
                break;
            case BlUE:
                System.out.println("Color is blue");
                break;
            case PINK:
                System.out.println("Color is pink");
                break;
            case RED:
                System.out.println("Color is red");
                break;
            default:
                System.out.println();

        }

    }
}
