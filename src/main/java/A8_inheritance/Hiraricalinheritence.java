class vehical{
    public void fule(){
        System.out.println("vehical is consumimg fuel");

    }
}
class bike extends vehical{
    public void bike(){
        System.out.println("bike have 2 tyre ");
        System.out.println("bike have 1 seat");
    }

}
class car extends vehical{
    public void car(){
        System.out.println("car have 4 tyre");
        System.out.println("car have 4 seats");
    }
}

public class Hiraricalinheritence {
    public static void main (String args[]){
    System.out.println("creating object of bike and calling parent methode ");
    bike b =new bike();
    b.fule();
    b.bike();
    System.out.println("creating object of car and calling parent methode ");
    car c1 = new car();
    c1.fule();
    c1.car();
    }


}
