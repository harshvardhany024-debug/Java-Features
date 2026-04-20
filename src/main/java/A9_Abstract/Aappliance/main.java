package main.java.A9_Abstract.Aappliance;

public class main {
    public static void main(String[] args) {
        Ac a = new Ac();
        a.turnon();
        System.out.println("--------------------------------");
        fan f = new fan();
        f.turnon();
    }
}
