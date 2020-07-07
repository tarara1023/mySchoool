package sessions.operators;

public class ArithmeticOperatorsWithVariables {

    public static void main(String[] args) {
        int num1 = 1099;
        int num2 = 6100;


        System.out.println(num1 + num2);

        //variables help you with your work. which makes your program easy to maintain

        double butterPrice = 10.99;
        double serviceFee = 1.99;
        int texPercent = 2;
        double tip = 2.5; //percentage

        System.out.println("Find butterPrice serice Fee and Tax total");
        System.out.println(10.99 * 2 / 100);

        System.out.println(10.99 + serviceFee + (10.99 * texPercent/100)); //hardcoded version
        System.out.println((butterPrice + serviceFee + (butterPrice * texPercent/100))* tip / 100 + butterPrice + serviceFee + (butterPrice * texPercent/100));


        double oneButterPriceTax = butterPrice * texPercent/100;
        double totalWithoutTip = butterPrice + serviceFee + oneButterPriceTax;

        System.out.println(totalWithoutTip * tip/100 + totalWithoutTip);

        double total = totalWithoutTip * tip/100 + totalWithoutTip;

        System.out.println(total);











    }
}
