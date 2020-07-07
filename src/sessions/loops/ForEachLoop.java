package sessions.loops;

public class ForEachLoop {

    public static void main(String[] args) {

        String [] names = {"Elon Names", "Melani", "Steve"};

        for (String name: names) { //from the begining
            System.out.println(name);
        }
        int [] nums = {11, 20, 12};
        int sum = 0;

        for (int num: nums) {
            sum += num;
            System.out.println(num);
        }
        System.out.println(sum);

        //regular loop can solve any for each problem bur not vice verca

        String[] products = {"Iphone phone", "Samsung phone", "Tea pot"};

        for (String product: products) {
            if (product.contains("phone")){
                System.out.println(product);
            }
        }
        for (int i = 0; i < products.length; i++) {

            if (products[i].contains("phone")) {
                System.out.println(products[i]);
            }
        }










    }
}
