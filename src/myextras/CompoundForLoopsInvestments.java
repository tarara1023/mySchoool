package myextras;

public class CompoundForLoopsInvestments {

    public static void main(String[] args) {
//        A = P(1 + R) ^ n
//        double amount;
//        double principal = 10000;
//        double rate = .01;

//        for (int day = 1; day <=20; day++) {
//            amount = principal *Math.pow(1+ rate, day);
//            System.out.println(day + "   " + amount)
//
//        }
        CompoundForLoopsInvestments.annualInterest(0.08, 2000);

    }
    public static void annualInterest (double rate, double deposit) {

        for (int year = 1; year <= 10; year++) {
            double amount = deposit * Math.pow(1 + rate, year);
            System.out.println(year + "   " + amount);
        }
    }
}
