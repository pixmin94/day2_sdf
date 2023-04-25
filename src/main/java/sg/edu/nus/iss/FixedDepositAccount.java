package sg.edu.nus.iss;

public class FixedDepositAccount extends BankAccount2 {
    private float interestRate;
    private int durationMonths;

    public float getInterestRate() { return interestRate; }
    public void setInterestRate(float interestRate) { this.interestRate = interestRate; }
    public int getDurationMonths() { return durationMonths; }
    public void setDurationMonths(int durationMonths) { this.durationMonths = durationMonths; }
    
    public FixedDepositAccount(String name, float balance) {
        super(name, balance);
        this.interestRate = 3;
        this.durationMonths = 6;
    }

    public FixedDepositAccount(String name, float balance, float interest) {
        super(name, balance);
        this.interestRate = interest;
        this.durationMonths = 6;
    }

    public FixedDepositAccount(String name, float balance, float interest, int duration) {
        super(name, balance);
        this.interestRate = interest;
        this.durationMonths = duration;
    }

    @Override
    public void withdraw(float amount) {
        System.out.println("Withdrawing is not allowed for fixed deposit accounts.");
    }

    @Override
    public void deposit(float amount) {
        System.out.println("Depositing is not allowed for fixed deposit accounts.");
    }

    public int getBalance(){
        float balance = super.getAccountBalance()  * (100 + this.interestRate) / 100;
        return Math.round(balance);
    }
}
