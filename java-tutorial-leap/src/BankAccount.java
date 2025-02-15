public class BankAccount {

    private String name;
    private int balance;
    private double rateOfInterest;

    BankAccount() {
        this.rateOfInterest = 5.6;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

//    public void setRateOfInterest(double rateOfInterest) {
//        this.rateOfInterest = rateOfInterest;
//    }
}
