package myextras.program;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuOptions2221 {


         public static void main(String[] args) {



            Menu app1 = new Menu(1, "Appetisers", "Fresh Guacamole", "Made daily with " +
                    "fresh avocados, chopped cilantro, diced tomatoes, " +
                    "red onions & jalapenos. ", 11.45);
            Menu app2 = new Menu(2, "Appetisers", "Eggrolls", "Crispy flour tortillas, chicken," +
                    " black beans, corn, jalapeño Jack cheese," +
                    " red peppers, spinach", 15.20);
            Menu app3 = new Menu(3, "Appetisers", "White Spinach Queso", "With pico, guacamole," +
                    " cilantro. Served with chips & salsa.", 13.23);
            Menu app4 = new Menu(4, "Appetisers", "Chips & Salsa", "Our signature, extra-thin corn " +
                    "tostada chips made fresh daily. Served with our fresh salsa", 12.15);
            Menu app5 = new Menu(5, "Appetisers", "Boneless Wings", "Hand-tossed in choice" +
                    " of sauce, celery, dipping sauce.", 15.55);
            Menu sal1 = new Menu(1, "Salads", "Shrimp Caesar Salad", "Shrimp, tomatoes," +
                    " queso fresco, tortilla strips with Caesar dressing.", 22.55);
            Menu sal2 = new Menu(2, "Salads", "Grilled Chicken Salad", "Tomatoes, corn & black bean " +
                    "salsa, shredded cheese with honey-lime vinaigrette.", 18.47);
            Menu sal3 = new Menu(3, "Salads", "Santa Fe Crispers® Salad", "Chicken Crispers®, pico, avocado," +
                    " cilantro, tortilla strips, house-made ranch & a " +
                    "drizzle of spicy Santa Fe sauce.", 23.45);
            Menu sal4 = new Menu(4, "Salads", "Caribbean Salad", "Pineapple, mandarin oranges," +
                    " dried cranberries, red bell peppers, green onions, " +
                    "cilantro, with honey-lime dressing.", 23.12);
            Menu sal5 = new Menu(5, "Salads", "Soup & House Salad", "A delicious bowl of " +
                    "Soup with a House Salad. ", 14.21);
            Menu main1 = new Menu(1, "Main", "Ancho Salmon", "Seared chile-rubbed" +
                    " Atlantic salmon, spicy citrus-chile sauce, cilantro, queso fresco.", 25.34);
            Menu main2 = new Menu(2, "Main", "Mango Chicken", "Chile spices, mango glaze " +
                    "& topped with chopped mango, cilantro, pico, avocado.", 23.21);
            Menu main3 = new Menu(3, "Main", "Shrimp Pasta", "Shrimp, penne in" +
                    " Alfredo sauce, topped with chile spices, Parmesan, tomatoes," +
                    " green onions", 25.68);
            Menu main4 = new Menu(4, "Main", "Chicken Pasta", "Grilled chicken, " +
                    "penne in Alfredo sauce, topped with chile spices," +
                    " Parmesan, tomatoes, green onions", 22.45);
            Menu main5 = new Menu(5, "Main", "California Turkey", "Bacon, avocado," +
                    " tomato, red onion, provolone, lettuce, cilantro-pesto mayo", 24.54);



            Scanner sc = new Scanner(System.in);


            Map<String, Double> checkMap = new LinkedHashMap<>();


            String answer = "";
            do {
                System.out.println("Please choose: \n" + "1. " + app1.getType() + "\n" +
                        "2. " + sal1.getType() + "\n" +
                        "3. " + main1.getType());
                int num = sc.nextInt();
                int quantity;
                if (num == 1) {
                    do {
                        System.out.println("Choose Appetisers: \n" + app1.getNumber() + ". " + app1.getName() + "\n"
                                + app2.getNumber() + ". " + app2.getName() + "\n" + app3.getNumber() + ". " + app3.getName() + "\n" +
                                +app4.getNumber() + ". " + app4.getName() + "\n" + +app5.getNumber() + ". " + app5.getName() + "\n");
                        num = sc.nextInt();
                        System.out.println("Enter quantity: ");
                        quantity = sc.nextInt();
//                    if (num == 1) checkMap.put((quantity + " " + app1.getName()), (quantity*app1.getPrice()));
                        if (num == 1) new Menu(quantity, app1.getName(), (app2.getPrice()));
                        else if (num == 2) checkMap.put((quantity + " " + app2.getName()), (quantity * app2.getPrice()));
                        else if (num == 3) checkMap.put((quantity + " " + app3.getName()), (quantity * app3.getPrice()));
                        else if (num == 4) checkMap.put((quantity + " " + app4.getName()), (quantity * app4.getPrice()));
                        else if (num == 5) checkMap.put((quantity + " " + app5.getName()), (quantity * app5.getPrice()));

                        System.out.println("Do you want more appetisers? Y/N");
                        answer = sc.next();

                    } while (answer.equalsIgnoreCase("Y"));
                    answer = "N";
                }

                else if (num == 2) {
                    do {
                        System.out.println("Choose Salads: \n" + sal1.getNumber() + ". " + sal1.getName() + "\n"
                                + sal2.getNumber() + ". " + sal2.getName() + "\n" + sal3.getNumber() + ". " + sal3.getName() + "\n" +
                                +sal4.getNumber() + ". " + sal4.getName() + "\n" + +sal5.getNumber() + ". " + sal5.getName() + "\n");
                        num = sc.nextInt();
                        System.out.println("Enter quantity: ");
                        quantity = sc.nextInt();
                        if (num == 1) checkMap.put((quantity + " " + sal1.getName()), (quantity*sal1.getPrice()));
                        else if (num == 2) checkMap.put((quantity + " " + sal2.getName()), (quantity*sal2.getPrice()));
                        else if (num == 3) checkMap.put((quantity + " " + sal3.getName()), (quantity*sal3.getPrice()));
                        else if (num == 4) checkMap.put((quantity + " " + sal4.getName()), (quantity*sal4.getPrice()));
                        else if (num == 5) checkMap.put((quantity + " " + sal5.getName()), (quantity*sal5.getPrice()));

                        System.out.println("Do you want more salads? Y/N");
                        answer = sc.next();

                    }while (answer.equalsIgnoreCase("Y"));
                    answer = "N";
                }
                else if (num == 3) {
                    do {
                        System.out.println("Main: \n" + main1.getNumber() + ". " + main1.getName() + "\n"
                                + main2.getNumber() + ". " + main2.getName() + "\n" + main3.getNumber() + ". " + main3.getName() + "\n" +
                                +main4.getNumber() + ". " + main4.getName() + "\n" + +main5.getNumber() + ". " + main5.getName() + "\n");
                        num = sc.nextInt();
                        System.out.println("Enter quantity: ");
                        quantity = sc.nextInt();
                        if (num == 1) checkMap.put((main1.getName()), (quantity*main1.getPrice()));
                        else if (num == 2) checkMap.put((quantity + " " + main2.getName()), (quantity*main2.getPrice()));
                        else if (num == 3) checkMap.put((quantity + " " + main3.getName()), (quantity*main3.getPrice()));
                        else if (num == 4) checkMap.put((quantity + " " + main4.getName()), (quantity*main4.getPrice()));
                        else if (num == 5) checkMap.put((quantity + " " + main5.getName()), (quantity*main5.getPrice()));

                        System.out.println("Do you want more main courses ? Y/N");
                        answer = sc.next();

                    }while (answer.equalsIgnoreCase("Y"));
                    answer = "N";
                }

                else
                    System.out.println("Invalid input");
                System.out.println("Are you done? Y/N");
                answer = sc.next();

            } while (answer.equalsIgnoreCase("N"));

            for (String key: checkMap.keySet()) {
                System.out.printf("%s: $%.2f \n",key, checkMap.get(key));
            }
            System.out.println();

            for (String key: checkMap.keySet()) {
                System.out.printf("%s  \n",key);
            }
            System.out.println("Enter item name:");
            sc.nextLine();
            String itemN = sc.nextLine();
            if(checkMap.containsKey(itemN))
                System.out.println(true);


            System.out.println();
        }




    }


//        Map<String, Double> app = new HashMap<>();
////        for (int i = 1; i < 6; i++)
//            app.put(app1.getName(), app1.getPrice());
//            app.put(app2.getName(), app2.getPrice());
//            app.put(app3.getName(), app3.getPrice());
//            app.put(app4.getName(), app4.getPrice());
//            app.put(app5.getName(), app5.getPrice());


//        List<Menu> appetisers = new ArrayList<>();
//        appetisers.add(app1);
//        appetisers.add(app2);
//        appetisers.add(app3);
//        appetisers.add(app4);
//        appetisers.add(app5);
//        List<Menu> salads = new ArrayList<>();
//        salads.add(sal1);
//        salads.add(sal2);
//        salads.add(sal3);
//        salads.add(sal4);
//        salads.add(sal5);
//        List<Menu> main = new ArrayList<>();
//        main.add(main1);
//        main.add(main2);
//        main.add(main3);
//        main.add(main4);
//        main.add(main5);
//        for (Menu app : appetisers) {
//            System.out.println(app);
//
//        }

//
//        Map<Integer, Map<String, Double>> menu = new HashMap<>();
//        menu.put(1, app);
////        menu.put(2, salads);
////        menu.put(3, main);
//        System.out.println(menu.get(1));



