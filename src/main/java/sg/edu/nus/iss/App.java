package sg.edu.nus.iss;

// import java.util.Random;
// import java.util.UUID;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // BankAccount2 corinaAccount = new BankAccount2("Corina", (float) 880000.00);
        // System.out.println(corinaAccount.listAccount());

        // corinaAccount.deposit(100.00f);
        // System.out.println(corinaAccount.accountString());

        // corinaAccount.withdraw(50.00f);
        // System.out.println(corinaAccount.accountString());

        // corinaAccount.setClosed(true);

        // for(String transDetails: corinaAccount.getTransactions()) {
        //     System.out.println(transDetails);
        // }

        FixedDepositAccount corinaAccount = new FixedDepositAccount("Corina", 100000);
        System.out.println(corinaAccount.listAccount());
        System.out.println(corinaAccount.getBalance());

    }

}
