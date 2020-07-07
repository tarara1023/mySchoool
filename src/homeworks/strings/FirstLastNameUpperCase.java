package homeworks.strings;

import java.util.Scanner;

public class FirstLastNameUpperCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String fullName = input.nextLine();
        System.out.println(upperCase(fullName));

    }
    public static String upperCase (String fullName) {

        String newFullName = fullName.substring(0,1).toUpperCase() + fullName.substring(1, fullName.indexOf(" ")) + " " +
                fullName.substring(fullName.indexOf(" ")+1, fullName.indexOf(" ")+2).toUpperCase() + fullName.substring(fullName.indexOf(" ") +
                2);
        return newFullName;
    }
}
