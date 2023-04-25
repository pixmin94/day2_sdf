package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class BankAccount2 {
    private final String name;
    private final String accountNumber;
    private float accountBalance;
    private List<String> transactions;
    private boolean isClosed;
    private Date createDate;
    private Date closeDate;

    // getters and setters
    public String getName() { return name; }
    public String getAccountNumber() { return accountNumber; }
    public float getAccountBalance() { return accountBalance; }
    public void setAccountBalance(float accountBalance) { this.accountBalance = accountBalance; }
    public List<String> getTransactions() { return transactions; }
    public void setTransactions(List<String> transactions) { this.transactions = transactions; }
    public boolean isClosed() { return isClosed; }
    public void setClosed(boolean isClosed) { this.isClosed = isClosed; }
    public Date getCreateDate() { return createDate; }
    public void setCreateDate(Date createDate) { this.createDate = createDate; }
    public Date getCloseDate() { return closeDate; }
    public void setCloseDate(Date closeDate) { this.closeDate = closeDate; }

    public BankAccount2(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountBalance = 0.0f;
        this.transactions = new ArrayList<>();
        this.isClosed = false;
        this.createDate = new Date();
    }

    public BankAccount2(String name, float initialBalance) {
        this.name = name;
        this.accountNumber = Integer.toString(new Random().nextInt(999999999));
        this.accountBalance = initialBalance;
        this.transactions = new ArrayList<>();
        this.isClosed = false;
        this.createDate = new Date();
    }

    public void deposit(float amount) {
        if (isClosed) {
            throw new IllegalArgumentException( "Account has been closed.");
        }

        if (amount < 0){
            throw new IllegalArgumentException("You cannot deposit a negative amount.");
        } else {
            accountBalance = accountBalance + amount;
            System.out.println("You have deposited "+amount+" to account "+accountNumber);

            Date date = new Date();
            transactions.add("$"+amount+" deposited on "+date);
        }
        
    }

    public void withdraw(float amount) {
        if (isClosed) {
            throw new IllegalArgumentException( "Account has been closed.");
        }

        if (amount < 0){
            throw new IllegalArgumentException("You cannot withdraw a negative amount.");
        } else {
            accountBalance = accountBalance - amount;
            System.out.println("You have withdraw "+amount+" from account "+accountNumber);

            Date date = new Date();
            transactions.add("$"+amount+" withdrawn on "+date);
        }
    }

    public String listAccount() {
        // System.out.println("Account fullname: " + name);
        // System.out.println("Account No.: " + accountNumber);
        // System.out.println("Balance: " + accountBalance);
        String output = "Account holder name: " + name + "\nAccount No.: " + accountNumber + "\nBalance: " + accountBalance;
        return output;
    }
    

    
}
