package myextras.interviewTasks;

public class UniqueStringOfChar {

    public static void main(String[] args) {

        String str = "jjjjjdddddeeeeffffgd";
        //output: = jdefg;
        String newS = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

             if(!newS.contains(str.charAt(i) + "")) { //we need double quotes to make it string not char
                 newS += str.charAt(i);
             }

        }
        System.out.println(newS);
    }
}
