package myextras.program;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MenuOptions2WithLamdas {


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


        //        Map<String, Double> app = new HashMap<>();
////        for (int i = 1; i < 6; i++)
//            app.put(app1.getName(), app1.getPrice());
//            app.put(app2.getName(), app2.getPrice());
//            app.put(app3.getName(), app3.getPrice());
//            app.put(app4.getName(), app4.getPrice());
//            app.put(app5.getName(), app5.getPrice());

        List<Menu> appetisers = new ArrayList<>();
        appetisers.add(app1);
        appetisers.add(app2);
        appetisers.add(app3);
        appetisers.add(app4);
        appetisers.add(app5);
        List<Menu> salads = new ArrayList<>();
        salads.add(sal1);
        salads.add(sal2);
        salads.add(sal3);
        salads.add(sal4);
        salads.add(sal5);
        List<Menu> main = new ArrayList<>();
        main.add(main1);
        main.add(main2);
        main.add(main3);
        main.add(main4);
        main.add(main5);
//        for (Menu app : appetisers) {
//            System.out.println(app);
//        }

        List<Menu> newL = filter(appetisers, x -> x.getPrice() < 15.00);
        System.out.println(newL + "\n" + newL.size());
    }
        public static List<Menu> filter (List<Menu> ls, Predicate<Menu> p) {
        List <Menu> copy = new ArrayList<>(ls);
        copy.removeIf(p);
        return copy;
        }

}