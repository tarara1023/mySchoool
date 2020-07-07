package sessions.collections.arrays;

public class SecondLargestNumber {

    public static void main(String[] args) {

       int [] arr = {4, 12, 9, 5, 1, 11};
       int max = 0;
       int max2 = 0;

       for (int i =0; i < arr.length; i++) {
           for (int j = i+1; j < arr.length; j++) {
               if (arr[i] > arr[j]) {
                   max2 = arr[i];
                   arr[i] = arr[j];
                   arr[j] = max2;

               }

           }
//           if (arr[i] > max2 && max2 < max)
//               max2 = arr[i];
       }
        System.out.println(max);
        System.out.println(arr[arr.length-2]);
//        System.out.println(secondLargestNum(arr));
//        System.out.println(secondLargestNum2(arr));

    }
    public static int secondLargestNum (int[] nums){
        int secondMax = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if (nums[i] > nums[j]){
                    secondMax = nums[i];
                    nums[i] = nums[j];
                    nums[j] = secondMax;
                }
            }
        }
        return nums[nums.length-2];
    }

    public static int secondLargestNum2 (int[] nums) {
        int max;
        int secondLargest;

        //taking first 2 elements of nums array
        if(nums[0] > nums[1]) {
            // if first element is greater than second
            max = nums[0];
            secondLargest = nums[1];

        }else {
            //if second element is greater than first element
            max = nums[1];
            secondLargest = nums[0];
        }
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > max) {
                secondLargest = max;
                max = nums[i];
            }else if (nums[i] < max && nums [i] > secondLargest)
                secondLargest = nums[i];
            //if element ar [i] is smaller then first largest anf greater than first largest

        }
        return secondLargest;
    }
}


