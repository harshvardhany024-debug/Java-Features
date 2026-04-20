package main.java.A6_polymorphism;

public class Runtimepolymorphsim  {
public static void main(String args[]){
    child c1= new child();
    c1.show();
    // we also do this
    parent p1= new child();
    p1.show();
    // ager parent ke method ko call krna hai to parent ka costructer lena hi hoga
}
}
