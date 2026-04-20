package main.java.A6_polymorphism;
class Demo {
 private int a , b, c;

    public Demo(){
        // caling default cinstructer
    a=90;
    b= 80;
    c= 12;
        System.out.println("inside the default constructer :"+ a+" "+b+" "+c);

    }
    public Demo(int z , int v){
        a=z;
        b=v;
        c=200;
        System.out.println("Inside 2 param constructer :"+a+" "+ b+" "+c);

    }
    public Demo (int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
        System.out.println("Inside 3 param constructer : "+ a+" "+b+" "+c);

    }
}



public class ConstructerOverloading {
    public static void main(String args[]){
        Demo d1= new Demo();
        Demo d2 = new Demo(67,89);
        Demo d3 = new Demo (100,100,100);

    }
}
