package myextras;

public class SecondMax2 {

        public static void main(String[] args) {
            int[] arr = {23, 45, 76, 32, 98, 3};
            System.out.println(SecondLarg(arr) + " second largest");
            System.out.println(SecondSmallest(arr) + " second smallest");
            int firstLargest = arr[0];
            int secondLargest = arr[0];
            System.out.println("The given array is: ");
            for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            for (int i = 0; i< arr.length; i++){
                if (arr[i] > firstLargest){
                    secondLargest = firstLargest;
                    firstLargest = arr[i];
                }else if (arr[i] > secondLargest){
                    secondLargest= arr[i];
                }
            }
            System.out.println("First largest number is: " + firstLargest);
            System.out.println("Second largest number is: " + secondLargest);
        }
        public static int SecondLarg (int [] numbs) {

            int firstMax = numbs[0];
            int secondMax = numbs[0];

            for (int i = 0; i < numbs.length; i++) {
                if (numbs[i] > firstMax) {
                    secondMax = firstMax;
                    firstMax = numbs[i];
                }else if (numbs[i] > secondMax) {
                    secondMax = numbs[i];
                }
            }
            return secondMax;
        }

        public static int SecondSmallest (int [] numbs) {

            int firstMin = numbs[0];
            int secondMin = numbs[0];

            for (int i = 0; i < numbs.length; i++) {
                if (numbs[i] < firstMin) {
                    secondMin = firstMin;
                    firstMin = numbs[i];
                }
                else if (numbs[i] < secondMin) {
                    secondMin = numbs[i];

                }
            }
            return secondMin;
        }










}
