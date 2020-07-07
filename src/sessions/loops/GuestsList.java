package sessions.loops;

import java.util.Scanner;

public class GuestsList {
    //Guest register
    //when name is entered store it
    //if name entered is empty end
    public static void main(String[] args) {
        System.out.println(listOfNames());
    }




    public static String listOfNames() {
        Scanner in = new Scanner(System.in);
        String listNames = "";
        String currentName;

        do {
            System.out.println("Enter guests name: ");
            currentName = in.nextLine();
            if (currentName.length() > 0)
                listNames += currentName + ", ";
            else {
                listNames = listNames.substring(0, listNames.length() - 2) + ".";
            }
        } while (currentName.length() != 0);


        return "Inputted names are: " + listNames;

    }
}
