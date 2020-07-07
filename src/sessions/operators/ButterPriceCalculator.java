package sessions.operators;

public class ButterPriceCalculator {

    public static void main(String [] args) {

        double butterPrice = 10.99;
        double serviceFee = 1.99;
        int taxPercent = 2;// from butterPrice + serviceFee
        double tip = 2.5; // 2.5 % butter Price + serviceFee+ tax

        double tax = (butterPrice + serviceFee)* taxPercent/100;
        double totalWithoutTip = butterPrice + serviceFee + tax;
        double tips = totalWithoutTip * tip / 100;
        double total = totalWithoutTip +  tips;

        System.out.println("Butter Total Price  $" + total);

    }
}
