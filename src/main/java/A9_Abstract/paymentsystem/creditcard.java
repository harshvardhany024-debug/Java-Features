package main.java.A9_Abstract.paymentsystem;

public class creditcard extends payment{

    creditcard(double amount){
        super(amount);
    }

    void pay (){
        System.out.println("the amount trasefer trough creditcard "+amount );

    }
}
