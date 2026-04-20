package main.java.A9_Abstract.car;

public class car extends vehicle {
    void startengine() {
        System.out.println("car engine started");
    }


    public static void main(String[] args) {
        car p = new car();
        p.startengine();
    }
}