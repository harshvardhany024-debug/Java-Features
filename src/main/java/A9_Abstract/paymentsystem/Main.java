package main.java.A9_Abstract.paymentsystem;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount ");
        double amount= sc.nextDouble();
        upi u = new upi(amount);
        u.pay();
        u.showRecipt();
        System.out.println("_____________________________________________-");
        creditcard c= new creditcard(amount);
        c.pay();
        c.showRecipt();


    }
}
