package myextras;

public class StringBuilder1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        StringBuilder sb1 = new StringBuilder("DevX School");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());

        StringBuilder sb2 = new StringBuilder(10);
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());

        StringBuilder sb3 = new StringBuilder();
        sb3.append("Name: ");
        sb3.append("John Doe");
        sb3.append(" \nGrade ").append("A").append(" \nGPA: ");
        sb3.append(4.0+3.2+.2);

        System.out.println(sb3);

        StringBuilder sb4 = new StringBuilder("DevX School");
        sb4.insert(4, " <>");

        System.out.println(sb4);

        StringBuilder sb5 = new StringBuilder("Senior SDET");
        sb5.delete(sb5.indexOf("e"),sb5.indexOf("r"));//not exluded
        System.out.println(sb5);

        StringBuilder sb7 = new StringBuilder("1000000");
        sb7.deleteCharAt(sb7.indexOf("0"));
        System.out.println(sb7);

        String str = "Chicago 2020";
        StringBuilder sb10 = new StringBuilder(str);
        sb10.append(" DevX School");
        sb10.reverse();
        str = sb10.toString();
        System.out.println(str);













    }
}
