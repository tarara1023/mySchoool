package sessions.string_methods;

public class StringBuilder12 {

    public static void main(String[] args) {
        String str = "Start";
        str.concat("+Middle");
        System.out.println(str);
        String str2 = str.concat("+End");
        System.out.println(str2);

        StringBuilder sb = new StringBuilder("Start");
        sb.append("+Middle");
        System.out.println(sb);

        StringBuilder sb1 = sb.append("+End");
        System.out.println(sb1);

        StringBuilder builder = new StringBuilder("31233344444");
        builder.insert(3, "-");
        System.out.println(builder);
        builder.insert(7, "-");
        builder.insert(11, "-");
        System.out.println(builder);


        StringBuilder builder12 = new StringBuilder("Cme Group inc");

        builder12.delete(9, 13);
        System.out.println(builder12);

        StringBuilder builder3 = new StringBuilder ("Cat Dog Cat");
        builder3.delete(3, 7);
        System.out.println(builder3);

        //deleteCharAt(int index)
        StringBuilder sb2 = new StringBuilder("Chicago");
        sb2.deleteCharAt(3);
        System.out.println(sb2);

        StringBuilder sb3 = new StringBuilder("John Doe");
        sb3.reverse();

        System.out.println(sb3);
        //Write a method which will reverse the String preserving the word order/
        String str10 = "Yuliana";
        StringBuilder sb5 = new StringBuilder(str10);
        System.out.println(str10);


    }
}
