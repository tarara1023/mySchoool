package sessions.polymorphism;

public interface BankAccount {

    public static final String domain = "FINANCE";
    public abstract void showBalance();

    String getAccountNumber();
    int chargeMonthlyFee();


    default void printDomain() {
        System.out.println(domain);
    }
}
