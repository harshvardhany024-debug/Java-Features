package main.java.A9_Abstract.Shape;

public class Circle extends shape{
    double r;
    Circle(double r){
        this.r=r;
    }

    void area(){
        double a= 3.1*r*r;
        System.out.println("area is :"+a);
    }
    public void perimeter( ) {
        double p = 2*3.1*r;
        System.out.println("the perimeter is :"+p);

    }

}
