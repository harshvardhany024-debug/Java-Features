package main.java.A8_inheritance;
class dada{
    public void v1(){
        System.out.println("beta tere liy 400 acr khet");
    }
}
class papa extends dada{
    public void v2(){
        System.out.println("beta tere liye shotgun 350");
    }}
    class beta extends papa{
        public void v3(){
            System.out.println("main apne samay ka malik hu");
        }
    }

public class Multilevelinhertance {
    public static void main (String args[]){
        beta b1 = new beta();
        b1.v1();
        b1.v2();
        b1.v3();
        // multiple inheritence me hum log parent ke paent se usi prperty grab kar skte hai bs
    }
}
