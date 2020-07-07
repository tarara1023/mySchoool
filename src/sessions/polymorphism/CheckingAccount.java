package sessions.polymorphism;

public class CheckingAccount implements BankAccount, DoubleInterfase{
    private  String accountNumber;
    private static int monthlyFee = 30;

    public CheckingAccount(int balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    private int balance;


    public void showBalance() {
        System.out.println("Your bamace is" + balance);
    }


    public void printDomain() {
    System.out.println("checking account Finance");
}


    public String getAccountNumber() {
      return accountNumber;
    }
    public int chargeMonthlyFee() {
        return balance -= monthlyFee;
    }
}
