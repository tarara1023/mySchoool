package myextras;

public class ArrayCodingBat {
    public static void main(String[] args) {
        int [] nums = {3, 5, 6, 7, 13, 3, 4};
        System.out.println(coding(nums));
        String [] str = {"D", "H", "B", "R"};
        String str2 = "B";
        System.out.println(isContainn(str, str2));

    }
    public static int coding (int [] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
            }else
                sum+=nums[i];
        }
        return sum;
    }

    public static boolean isContainn  (String [] arr, String str2) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(str2))
                return true;
        }
        return false;
    }

}
