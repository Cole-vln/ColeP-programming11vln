package DataAbstractionAssignment;
import java.util.Date;

public class Deposit {
    private double amount;
    private Date date;
    private String account;

    Deposit(){
        java.util.Date date1=new java.util.Date();
        amount=0;
        account="default";
        date = date1;
    }

    Deposit(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    public String toString(){
        //your code here

        return "deposit of:$" + amount + " date:" + date + " into account:" + account;
    }
}
