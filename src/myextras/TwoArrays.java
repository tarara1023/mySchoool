package myextras;

public class TwoArrays {
    public static void main(String[] args) {

        String [] [] cars = {
                {"Toyota", "Ford", "Mersedes"},
                {"Lamborgini", "Porshe", "Maserati", "Lada"}
        };
        for (int i = 0; i < cars.length; i++) {
            for (int j =0; j < cars.length; j++) {
                System.out.println(cars[i][j]);
            }

        }
        for (String [] classOfCars: cars) {
            for (String model: classOfCars) {
                System.out.println(model);
            }
        }
    }
}
