package myextras.program.akinai;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class RestaurantMenu {
    public static void createACheck() {
        Restaurant app1 = new Restaurant(1, "Appetisers",
                "Guacamole",
                "Avocados,  cilantro, tomatoes, jalapenos.",
                11.45);
        Restaurant app2 = new Restaurant(2, "Appetisers",
                "Eggrolls",
                "Tortillas, chicken, black beans, corn.",
                15.20);
        Restaurant app3 = new Restaurant(3, "Appetisers",
                "Queso",
                "Pico, guacamole, cilantro, chips, salsa.",
                13.23);
        Restaurant app4 = new Restaurant(4, "Appetisers",
                "Chips&Salsa",
                "Corn tostada chips. Served with our fresh salsa",
                12.15);
        Restaurant app5 = new Restaurant(5, "Appetisers",
                "Wings",
                "Hand-tossed in choice of sauce, celery, dipping sauce.",
                15.55);
        Restaurant sal1 = new Restaurant(1, "Salads",
                "Shrimp Caesar Salad",
                "Shrimp, tomatoes, tortilla strips with Caesar dressing.",
                22.55);
        Restaurant sal2 = new Restaurant(2, "Salads",
                "Grilled Chicken Salad",
                "Tomatoes, salsa, cheese with honey-lime vinaigrette.",
                18.47);
        Restaurant sal3 = new Restaurant(3, "Salads",
                "Santa Fe Crispers Salad",
                "Chicken Crispers pico, avocado, cilantro, tortilla.",
                23.45);
        Restaurant sal4 = new Restaurant(4, "Salads",
                "Caribbean Salad",
                "Pineapple, oranges, cranberries, peppers",
                23.12);
        Restaurant sal5 = new Restaurant(5, "Salads",
                "Soup & House Salad",
                "A delicious bowl of Soup with a House Salad. ",
                14.21);
        Restaurant main1 = new Restaurant(1, "Main",
                "Ancho Salmon",
                "Seared chile-rubbed Atlantic salmon, spicy sauce, cilantro.",
                25.34);
        Restaurant main2 = new Restaurant(2, "Main",
                "Mango Chicken",
                "Chile spices, cilantro, pico, avocado.",
                23.21);
        Restaurant main3 = new Restaurant(3, "Main",
                "Shrimp Pasta",
                "Shrimp, penne in Alfredo sauce, Parmesan, tomatoes,",
                25.68);
        Restaurant main4 = new Restaurant(4, "Main",
                "Chicken Pasta",
                "Grilled chicken, penne in Alfredo sauce, Parmesan, tomatoes.",
                22.45);
        Restaurant main5 = new Restaurant(5, "Main",
                "California Turkey",
                "Bacon, avocado, tomato, provolone, lettuce",
                24.54);
        Scanner sc = new Scanner(System.in);
        List<Restaurant> listOfApps = new ArrayList<Restaurant>();
        List<Restaurant> listOfSalads = new ArrayList<Restaurant>();
        List<Restaurant> listOfMains = new ArrayList<Restaurant>();
        String answer = "";
        String item = "";
        do {
            int quantity;
            System.out.println("Please choose: \n" +
                    "1. " + app1.getType() + "\n" +
                    "2. " + sal1.getType() + "\n" +
                    "3. " + main1.getType());
            int num = sc.nextInt();
            if (num == 1) {
                do {
                    do {
                        System.out.println("Choose Appetisers: \n" + "1. " + app1.getName() + " (" + app1.getIngredients() + ") $" + app1.getPrice() + "\n"
                                + "2. " + app2.getName() + " (" + app2.getIngredients() + ") $" + app2.getPrice() + "\n"
                                + "3. " + app3.getName() + " (" + app3.getIngredients() + ") $" + app3.getPrice() + "\n"
                                + "4. " + app4.getName() + " (" + app4.getIngredients() + ") $" + app4.getPrice() + "\n"
                                + "5. " + app5.getName() + " (" + app5.getIngredients() + ") $" + app5.getPrice());
                        num = sc.nextInt();
                        if (num < 1 || num > 5) { ///new
                            System.out.println("Invalid input");
                        }
                    } while (num < 1 || num > 5);
                    System.out.println("Enter quantity: ");
                    quantity = sc.nextInt();
//
                    if (num == 1) {
                        Restaurant appet1 = new Restaurant(quantity, app1.getName(), app1.getPrice());
                        listOfApps.add(appet1);
                    } else if (num == 2) {
                        Restaurant appet2 = new Restaurant(quantity, app2.getName(), app2.getPrice());
                        listOfApps.add(appet2);
                    } else if (num == 3) {
                        Restaurant appet3 = new Restaurant(quantity, app3.getName(), app3.getPrice());
                        listOfApps.add(appet3);
                    } else if (num == 4) {
                        Restaurant appet4 = new Restaurant(quantity, app4.getName(), app4.getPrice());
                        listOfApps.add(appet4);
                    } else if (num == 5) {
                        Restaurant appet5 = new Restaurant(quantity, app5.getName(), app5.getPrice());
                        listOfApps.add(appet5);
                    }
                    System.out.println("Do you want more appetisers? Y/N");
                    answer = sc.next();
                } while (answer.equalsIgnoreCase("Y"));
                answer = "N";
            } else if (num == 2) {
                do {
                    do {
                        System.out.println("Choose Salads: \n" + "1. " + sal1.getName() + " (" + sal1.getIngredients() + ") $" + sal1.getPrice() + "\n"
                                + "2. " + sal2.getName() + " (" + sal2.getIngredients() + ") $" + sal2.getPrice() + "\n"
                                + "3. " + sal3.getName() + " (" + sal3.getIngredients() + ") $" + sal3.getPrice() + "\n"
                                + "4. " + sal4.getName() + " (" + sal4.getIngredients() + ") $" + sal4.getPrice() + "\n"
                                + "5. " + sal5.getName() + " (" + sal5.getIngredients() + ") $" + sal5.getPrice());
                        num = sc.nextInt();
                        if (num < 1 || num > 5) { ///new
                            System.out.println("Invalid input");
                        }
                    } while (num < 1 || num > 5);
                    System.out.println("Enter quantity: ");
                    quantity = sc.nextInt();
                    if (num == 1) {
                        Restaurant salad1 = new Restaurant(quantity, sal1.getName(), sal1.getPrice());
                        listOfSalads.add(salad1);
                    } else if (num == 2) {
                        Restaurant salad2 = new Restaurant(quantity, sal2.getName(), sal2.getPrice());
                        listOfSalads.add(salad2);
                    } else if (num == 3) {
                        Restaurant salad3 = new Restaurant(quantity, sal3.getName(), sal3.getPrice());
                        listOfSalads.add(salad3);
                    } else if (num == 4) {
                        Restaurant salad4 = new Restaurant(quantity, sal4.getName(), sal4.getPrice());
                        listOfSalads.add(salad4);
                    } else if (num == 5) {
                        Restaurant salad5 = new Restaurant(quantity, sal5.getName(), sal5.getPrice());
                        listOfSalads.add(salad5);
                    }
                    System.out.println("Do you want more salads? Y/N");
                    answer = sc.next();
                } while (answer.equalsIgnoreCase("Y"));
                answer = "N";
            } else if (num == 3) {
                do {
                    do {
                        System.out.println("Choose Main Courses: \n" + "1. " + main1.getName() + " (" + main1.getIngredients() + ") $" + main1.getPrice() + "\n"
                                + "2. " + main2.getName() + " (" + main2.getIngredients() + ") $" + main2.getPrice() + "\n"
                                + "3. " + main3.getName() + " (" + main3.getIngredients() + ") $" + main3.getPrice() + "\n"
                                + "4. " + main4.getName() + " (" + main4.getIngredients() + ") $" + main4.getPrice() + "\n"
                                + "5. " + main5.getName() + " (" + main5.getIngredients() + ") $" + main5.getPrice());
                        num = sc.nextInt();
                        if (num < 1 || num > 5) { ///new
                            System.out.println("Invalid input");
                        }
                    } while (num < 1 || num > 5);
                    System.out.println("Enter quantity: ");
                    quantity = sc.nextInt();
                    if (num == 1) {
                        Restaurant mains1 = new Restaurant(quantity, main1.getName(), main1.getPrice());
                        listOfMains.add(mains1);
                    } else if (num == 2) {
                        Restaurant mains2 = new Restaurant(quantity, main2.getName(), main2.getPrice());
                        listOfMains.add(mains2);
                    } else if (num == 3) {
                        Restaurant mains3 = new Restaurant(quantity, main3.getName(), main3.getPrice());
                        listOfMains.add(mains3);
                    } else if (num == 4) {
                        Restaurant mains4 = new Restaurant(quantity, main4.getName(), main4.getPrice());
                        listOfMains.add(mains4);
                    } else if (num == 5) {
                        Restaurant mains5 = new Restaurant(quantity, main5.getName(), main5.getPrice());
                        listOfMains.add(mains5);
                    }
                    System.out.println("Do you want more main courses ? Y/N");
                    answer = sc.next();
                } while (answer.equalsIgnoreCase("Y"));
                answer = "N";
            } else if (num < 1 || num > 3) { ///new
                answer = "N";
                System.out.println("Invalid input");
                continue;
            }
            System.out.println("Are ready for checkout? Y/N");
            answer = sc.next();
        } while (answer.equalsIgnoreCase("N"));
        System.out.println();
        printOutListOfItems(listOfApps, listOfSalads, listOfMains);
        do {
            System.out.println();
            System.out.println("Do you want to remove item. Y/N");
            answer = sc.next();
            if (answer.equalsIgnoreCase("y")) {
                System.out.println("Enter items name");
                sc.nextLine();
                item = sc.nextLine();
                boolean isIR = isItemRemoved(listOfApps, listOfSalads, listOfMains, item);
                if (isIR) {
                    System.out.println(item + " was removed");
                } else {
                    System.out.println("No such an item");
                }
            }
        } while (answer.equalsIgnoreCase("y"));
        answer = "y";
        do {
            System.out.println("Do you want to update check. Y/N");
            answer = sc.next();
            if (answer.equalsIgnoreCase("y")) {
                System.out.println("Enter items name");
                sc.nextLine();
                item = sc.nextLine();
                boolean isCU = isCheckUpdated(listOfApps, listOfSalads, listOfMains, item);
                if (isCU) {
                    System.out.println();
                } else {
                    System.out.println("No such an item");
                }
            }
        } while (answer.equalsIgnoreCase("y"));
        printOutCheck(listOfApps, listOfSalads, listOfMains);
    }

    public static void printOutListOfItems(List<Restaurant> list1, List<Restaurant> list2, List<Restaurant> list3) {
        int counter = 0;
        System.out.println("Appetisers: ");
        for (Restaurant app : list1) {
            counter++;
            System.out.printf("%d. %s\t$%.2f * %d\n", counter, app.getName(), app.getPrice(), app.getNumber());
        }
        System.out.println("Salads: ");
        for (Restaurant app : list2) {
            counter++;
            System.out.printf("%d. %s\t$%.2f * %d\n", counter, app.getName(), app.getPrice(), app.getNumber());
        }
        System.out.println("Main Courses: ");
        for (Restaurant app : list3) {
            counter++;
            System.out.printf("%d. %s\t$%.2f * %d\n", counter, app.getName(), app.getPrice(), app.getNumber());
        }
    }

    public static boolean isItemRemoved(List<Restaurant> list1, List<Restaurant> list2, List<Restaurant> list3, String item) {
        boolean isRemoved = false;
//        while (removeAppIterator.hasNext()) {
//            Restaurant app = removeAppIterator.next();
//            if (item.equalsIgnoreCase(app.getName())) {
//                removeAppIterator.remove();
//                isRemoved = true;
//            }
//        }
        for(Restaurant app: list1) {
            if (item.equalsIgnoreCase(app.getName())) {
                list1.remove(app);
                isRemoved = true;
            }
        }

//        list1.removeIf(x -> x.getName().equalsIgnoreCase(item));
        for(Restaurant app: list2) {
            if (item.equalsIgnoreCase(app.getName())) {
                list2.remove(app);
                isRemoved = true;
            }
            }
        for(Restaurant app: list3) {
            if (item.equalsIgnoreCase(app.getName())) {
                list3.remove(app);
                isRemoved = true;
            }
            }

        return isRemoved;
    }

    public static boolean isCheckUpdated(List<Restaurant> list1, List<Restaurant> list2, List<Restaurant> list3, String item) {
        Scanner sc = new Scanner(System.in);
        boolean isUpdated = false;
        List<Restaurant> allItems = new ArrayList<>();
        allItems.addAll(list1);
        allItems.addAll(list2);
        allItems.addAll(list3);
        for (Restaurant app : allItems) {
            if (item.equalsIgnoreCase(app.getName())) {
                System.out.println("Please enter quantity for " + item);
                int newQuantity = sc.nextInt();
                app.setNumber(newQuantity);
                isUpdated = true;
                System.out.printf("%s\t$%.2f * %d \n", app.getName(), app.getPrice(), app.getNumber());
            }
        }
        return isUpdated;
    }

    public static void printOutCheck(List<Restaurant> list1, List<Restaurant> list2, List<Restaurant> list3) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int subtotalPrices = 0;
        int counter = 0;
        System.out.println("Appetisers: ");
        for (Restaurant app : list1) {
            counter++;
            System.out.printf("%d. %s\t$%.2f * %d\n", counter, app.getName(), app.getPrice(), app.getNumber());
            subtotalPrices += app.getPrice() * app.getNumber();
        }
        System.out.println("Salads: ");
        for (Restaurant app : list2) {
            counter++;
            System.out.printf("%d. %s\t$%.2f * %d\n", counter, app.getName(), app.getPrice(), app.getNumber());
            subtotalPrices += app.getPrice() * app.getNumber();
        }
        System.out.println("Main Courses: ");
        for (Restaurant app : list3) {
            counter++;
            System.out.printf("%d. %s\t$%.2f * %d\n", counter, app.getName(), app.getPrice(), app.getNumber());
            subtotalPrices += app.getPrice() * app.getNumber();
        }
        System.out.println();
        System.out.println("Tip suggestions: ");
        System.out.println("10% Good - \t$" + subtotalPrices * 10 / 100);
        System.out.println("15% Great - \t$" + subtotalPrices * 15 / 100);
        System.out.println("18% Excellent - \t$" + subtotalPrices * 18 / 100);
        System.out.println("Enter % for tips: ");
        int tips = sc.nextInt();
        tips = subtotalPrices * tips / 100;
        System.out.println();
        DecimalFormat formater = new DecimalFormat(".00");
        System.out.println("Subtotal: \t$" + subtotalPrices +
                "\nTips: \t$" + tips +
                "\nTax: \t$" + formater.format(subtotalPrices * 10.25 / 100) +
                "\nYour total is: \t$" + formater.format(subtotalPrices + tips + subtotalPrices * 10.25 / 100));
    }
}

