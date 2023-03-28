import java.util.Scanner;
class BankAcc{
    int accNumber;
    String name, address, accType;
    double  accBal;
    static int count = 0;
    BankAcc(){
        accNumber = ++count;
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER NAME: ");
        name = in.nextLine();
        System.out.println("ENTER ADDRESS: ");
        address = in.nextLine();
        System.out.println("ENTER ACC TYPE: ");
        accType =  in.nextLine();
        System.out.println("ENTER ACC BALANCE: ");
        accBal =  in.nextDouble();
    }
    BankAcc(String name, String address, String accType, double accBal){
        accNumber = ++count;
        this.name = name;
        this.address = address;
        this.accType = accType;
        this.accBal = accBal;
    }
    void computeInterest(int time){
        double interest;
        if("sb".equals(accType)){
            interest = 0.05 * accBal * time;
            System.out.println("INTEREST EARNED for SB account is "+ interest);
        }
        else if ("rd".equals(accType)){
            interest = 0.063 * accBal * time;
            System.out.println("INTEREST EARNED for RD account is "+ interest);
        }
        else if ("fd".equals(accType)){
            interest = 0.0765 * accBal * time;
            System.out.println("INTEREST EARNED for FD account is "+ interest);
        }
        else
            System.out.println("Invalid account type");
    }
    void deposit(double amount){
        accBal = accBal + amount;
        System.out.println("ACC BALANCE IS "+ accBal);
    }
    void withdraw(double amount){
        if((accBal-amount)<1000)
            System.out.println("INSUFFICIENT BALANCE!!!!");
        else
        {
            accBal = accBal - amount;
            System.out.println("ACC BALANCE IS "+ accBal);
        }
    }
}

public class TW3 {
    public static void main(String[] args){
        BankAcc b1 = new BankAcc();
        BankAcc b2 = new BankAcc("Namitha","xyz","fd",20000);
        BankAcc b3 = new BankAcc();
        b1.computeInterest(1);
        b2.computeInterest(1);
        b3.computeInterest(1);
        b1.deposit(500);
        b1.withdraw(1500);
        b2.deposit(10000);
        b2.withdraw(1000);
        b3.deposit(2000);
        b3.withdraw(3000);
    }
} 