package mentorings;

import java.util.Scanner;

public class ScrennSizeMethods {

    public static void main(String[] args) {
        /*First ask user for a screen size. If screen size is equals to 13.3,
         * add  $200 to the laptop price. If screen size is equals to  15.0 - add
         * $300 to the laptop price. If screen size is equals to  17.3 - add  $400 to the laptop price.
         * Then ask user for CPU type. If CPU type equals to i3, add  $150 to the laptop price.
         * If CPU type equals to i5, add  $250 to the laptop price.
         * If CPU type equals to i7, add  $350 to the laptop price.
         * There are 2 options: FULLHD and 4K.
         * Add $100 if it's FULLHD screen and $200 if it's 4K screen.
         */

        Scanner input = new Scanner(System.in);
        ScrennSizeMethods myObject = new ScrennSizeMethods();
        double screenSize;
        int mainPrise = 500;
        System.out.println("Select screen size\n-13.3\n-15.0\n-17.3:");
        screenSize = input.nextDouble();
        System.out.println("Choose CPU type\ni3\ni5\ni7: ");
        String cpuType = input.next();
        System.out.println("Choose option: (FULLHD or 4K): ");
        String options = input.next();
        int prise = mainPrise + myObject.screenSize(screenSize) + myObject.cpuType(cpuType) + myObject.options(options);
        System.out.println(prise);

    }

    public int screenSize (double scrSize) {

        if (scrSize == 13.3)
        return + 200;
        else if (scrSize == 15.0)
            return + 300;
        else if (scrSize == 17.3)
            return + 400;
        else
            return 0;
    }

    public int cpuType (String type) {
        if (type.equalsIgnoreCase("i3"))
            return + 150;
        else if (type.equalsIgnoreCase("i5"))
            return + 250;
        else if (type.equalsIgnoreCase("i7"))
            return + 350;
        else
            return 0;
    }
    public int options (String options) {
        if (options.equalsIgnoreCase("FULLHD"))
            return + 100;
        else if (options.equalsIgnoreCase("4K"))
            return + 200;
        else
            return 0;
    }
}
