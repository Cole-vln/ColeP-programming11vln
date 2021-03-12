package DataAbstractionAssignment;
import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits = new ArrayList<Deposit>();
    private ArrayList<Withdraw> withdraws = new ArrayList<Withdraw>();

    private double checkDeposit;
    private double savingDeposit;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    Customer(){
        //create default constructor
        name = "default name";
        accountNumber = 45;
        checkDeposit = 45.45;
        savingDeposit = 4.5;
    }
    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        //constructor code here
        this.name = name;
        this.accountNumber = accountNumber;
        this.checkDeposit = checkDeposit;
        this.savingDeposit = savingDeposit;
    }

    public double deposit(double amt, Date date, String account){
        //your code here
        //deposit method
        String receipt = "";
        if(CHECKING == account){
            checkDeposit = checkDeposit + amt;
            receipt = receipt + "Deposit of: " + amt + " Date: " + date + " into account: Checking";
            System.out.println(receipt);
            //add deposit to list
            Deposit e = new Deposit(amt, date, account);
            deposits.add(e);
            return checkDeposit;
        }
        else if(SAVING == account){
            savingDeposit = savingDeposit + amt;
            receipt = receipt + "Deposit of: " + amt + " Date: " + date + " into account: Saving";
            System.out.println(receipt);
            //add deposit to list
            Deposit e = new Deposit(amt, date, account);
            deposits.add(e);
            return savingDeposit;
        }
        else{
            System.out.println("Invalid account, try Checking or Saving.");
            return 0;
        }
    }
    public double withdraw(double amt, Date date, String account){
        //your code here
        //withdraw method
        boolean brokedetector = checkOverdraft(amt, account);
        if(brokedetector == true){
            System.out.println("You're broke, no currency in this account.");
            return 0;
        }
        else {
            String receipt = "";
            if (CHECKING == account) {
                checkDeposit = checkDeposit - amt;
                receipt = receipt + "Withdrawal of: " + amt + " Date: " + date + " from account: Checking";
                System.out.println(receipt);
                Withdraw e = new Withdraw(amt, date, account);
                //add withdrawal to the list
                withdraws.add(e);
                return checkDeposit;
            } else if (SAVING == account) {
                savingDeposit = savingDeposit - amt;
                receipt = receipt + "Withdrawal of: " + amt + " Date: " + date + " from account: Checking";
                System.out.println(receipt);
                Withdraw e = new Withdraw(amt, date, account);
                //add withdrawal to the list
                withdraws.add(e);
                return savingDeposit;
            } else {
                System.out.println("Invalid account, try Checking or Saving.");
                return 0;
            }

        }
    }
    private boolean checkOverdraft(double amt, String account){
        //your code here
        //checks to make sure the customer has sufficient funds to withdraw
        if(CHECKING == account){
            if (checkDeposit-amt<OVERDRAFT){
                return true;
            }
            else {
                return false;
            }
        }
        else if(SAVING == account){
            if (savingDeposit-amt<OVERDRAFT){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }

}
