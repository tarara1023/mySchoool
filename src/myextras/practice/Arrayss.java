package myextras.practice;

public class Arrayss {

    public static void main(String[] args) {

        int [] arr = new int[] {173, 29, 391,41};
        int [] arr2 = new int [] {1703, 329, 3961, 6641};
        int res = method(arr);
        System.out.println("Result: " + res);

        res = method(arr2);
        System.out.println("Result 2: " + res);



    }
    static int method (int a[]) {
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= a[temp])
                temp = i;
            System.out.println(temp);
        }
        return (a[temp]);
    }
}
