package main.java.A6_polymorphism;

class Add {
    public int add(int a, int b) {

        return  a + b;
        // System.out.println("Addition of twoo numbers is : " + c);

    }

    public double add(double a, double b) {
        return   a + b;
        // System.out.println("Addition of two numbers is : " + c);
    }

}

public class complie_timepolymorphism {
    public static void main(String args[]) {
        Add a1 = new Add();

        System.out.println(a1.add(34, 56));
        System.out.println(a1.add(34.78, 78.9));


    }


}
