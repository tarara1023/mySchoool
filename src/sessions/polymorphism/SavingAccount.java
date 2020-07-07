package sessions.polymorphism;

public class SavingAccount implements BankAccount{

    private int balance;
    private String accountNumber;
    static int montlyFee = 30;

    public SavingAccount(int balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    @Override
    public void showBalance() {
        System.out.println("Savongs Account" + balance);
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public int chargeMonthlyFee() {
        return balance-= montlyFee;
    }
}
