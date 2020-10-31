public class Account {
    private long accountNumber;
    private String accountName;
    private double accountBalance;

    public Account(long accountNumber, String accountName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    public Account() {
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber= " + accountNumber +
                ", accountName= " + accountName + '\'' +
                ", accountBalance= " + accountBalance +
                '}';
    }

    public Account(long accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        accountBalance = 50;
    }

    public double recharge(int i) {

        System.out.println("vui long nhap lai");

        accountBalance += i;

        return accountBalance;
    }

    public double withDrawal(int i) {

        int percent = (int) (accountBalance * 2 / 100);
        accountBalance = accountBalance - (i + percent);
        return accountBalance;
    }

    public double expiredDate() {
        return accountBalance = accountBalance + accountBalance * 0.035;
    }


}
