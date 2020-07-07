package myextras.program.akinai;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        isLogin();
    }
    public static List<Restaurant> allEmployees() {
        List<Restaurant> loginAndPasswords = new ArrayList<>();
        loginAndPasswords.add(new Restaurant("login1", "password1"));
        loginAndPasswords.add(new Restaurant("login2", "password2"));
        loginAndPasswords.add(new Restaurant("login3", "password3"));
        loginAndPasswords.add(new Restaurant("login4", "password4"));
        loginAndPasswords.add(new Restaurant("login5", "password5"));
        return loginAndPasswords;
    }
    public static boolean isLogin (){
        List<Restaurant> loginAndPasswords = new ArrayList<>(allEmployees());
        Scanner input = new Scanner(System.in);
        String login = "";
        String employeesLogin = "";
        do {
            System.out.println("Please enter login");
            login = input.next();
            System.out.println("Please enter password");
            String password = input.next();
            for (Restaurant lAndP : loginAndPasswords) {
                employeesLogin = lAndP.getLogin();
                String employeesPassword = lAndP.getPassword();
                if (employeesLogin.equals(login)) {
                    if (employeesPassword.equals(password)) {
                        System.out.println("You are loged in");
                        RestaurantMenu.createACheck();
                        return true;
                    }
                }
            }
            System.out.println("Invalid  login or password.\nPlease try again");
        } while (!employeesLogin.equals(login));
        return false;
    }
}
