package main.java.A9_Abstract.Shape;

public class Rectangle extends shape {
    double l,b;
    Rectangle(double l ,double b){
        this.l=l;
        this.b=b;

    }
    void area(){
        double area = l*b;
 System.out.println("the area of rectangle is "+area);
    }

    public void perimeter(){

  double p1=2*(l+b) ;
        System.out.println("the perimeter of rectangle is :"+p1);
    }
}
