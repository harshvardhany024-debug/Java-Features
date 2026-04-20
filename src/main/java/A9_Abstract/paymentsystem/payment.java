package main.java.A9_Abstract.paymentsystem;

public abstract class payment {
    double amount;
    payment(double amount) {
this.amount=amount;
    }// pc for amouunt reciving
    abstract void pay();
   void  showRecipt(){
       System.out.println("Payment sussefully done");
   }
}
