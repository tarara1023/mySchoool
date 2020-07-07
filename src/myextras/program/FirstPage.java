package myextras.program;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class FirstPage {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("JohnDoe2019", "superh@rdPa$$");
        map.put("Yuliana123", "juliana123@");
        map.put("ElonM2020", "mask2020$$");
        map.put("SDET2020", "@DevXSchool@");
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Your username: ");
//        String userName = sc.next();
//        System.out.println("Enter Your Password: ");
//        String password = sc.next();


        String UN = JOptionPane.showInputDialog("Enter Your username: ");
        String pass = JOptionPane.showInputDialog("Enter Your Password: ");
        String newU = userName(UN, pass, map);

        JOptionPane.showMessageDialog(null, newU);





    }

    public static String userName(String userName, String password, Map<String, String> map) {

       if (map.containsKey(userName)) {
           if (map.get(userName).equals(password))
               return "Next page: ";
               ///here should be method

           else
               return "Invalid password";
       }
        else
           return "Username doesnt exist";
    }

    public static void secondPage() {
        System.out.println();

    }














}
