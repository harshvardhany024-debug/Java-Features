package main.java.A9_Abstract.Shape;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        System.out.println("enter the radius of cicle :");
        Scanner s= new Scanner(System.in);
        double r= s.nextDouble();
        Circle c1 = new Circle(r);
        c1.area();// abtract methode
        c1.perimeter();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("enter the lengt and breadth:");
        Scanner p= new Scanner(System.in);
        double l=p.nextDouble();
        double b=p.nextDouble();
        Rectangle r1= new Rectangle(l,b);
        r1.area(); // abstract methode
        r1.perimeter();



    }
}
