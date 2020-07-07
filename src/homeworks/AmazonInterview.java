package homeworks;

public class AmazonInterview {

    //Amazon Interview task:
    //Count number of occurrences of a sequence of a characters in a String;
    //Example:
    //Input: "aaaafdbbbratbeeaa"
    //Ouptut: "4afd3bratb2e2a"
    //Task 2:
    //Improve your reverse String method with a
    // check for palindrome without increasing the complexity!
    //The first 3 people to solve these will get Java
    // endorsements from me on LinkedIn in the future=) Share your code
    // with me in private messages

    public static void main(String[] args) {

        String inp = "aaaafdbbbratbeeaa";
        int count = 0;
        int cc = 1;
        String result = "";
        int i = 0;

        for (i = 0; i < inp.length(); i++) {
            if (inp.charAt(i) == inp.charAt(i+1))
                count++;
//            System.out.println(inp.charAt(i) + " " +  count);
            System.out.println(count);
        }




    }
}
