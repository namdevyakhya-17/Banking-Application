import java.util.*;
public class Bank {
    private String Name;
    private long accountNumber;
    private double balance;

    public Bank(String Name , long accountNumber,double balance){
        this.Name = Name;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Rs"+amount+"deposited successfully:");
        }
        else{
            System.out.println("invalid deposit amount");
        }
    } 
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Rs"+amount+"withdraw succesfully");
        }
        else{
            System.out.println("Insufficient balance or invalid amount");
        }
    }
}
