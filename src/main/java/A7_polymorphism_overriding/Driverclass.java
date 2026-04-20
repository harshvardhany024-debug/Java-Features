package main.java.A7_polymorphism_overriding;

public class Driverclass {
    public static void main(String args[]) {

        RBI sbi1 = new SBI();
        sbi1.RoIonsavingAccaunt();
        System.out.println("----------------------------------");
        RBI hdfc1 = new HDFC();
        hdfc1.RoIonsavingAccaunt();
        System.out.println("----------------------------------");
        RBI icici1 = new ICICI();
        icici1.RoIonsavingAccaunt();
        System.out.println("----------------------------------");
        RBI pnb1 = new PNB();
        pnb1.RoIonsavingAccaunt();
        System.out.println("----------------------------------");
        RBI ufb1 = new UFB();
        ufb1.RoIonsavingAccaunt();
    }
}