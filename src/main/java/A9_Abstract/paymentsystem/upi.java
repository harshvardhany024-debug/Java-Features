package main.java.A9_Abstract.paymentsystem;

public class upi extends payment {
    upi(double amount){
        super(amount);
    }
    void pay(){
        System.out.println("the amount trasfer through upi"+amount);
    }
}
