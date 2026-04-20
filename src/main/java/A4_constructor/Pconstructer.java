package A4_constructor;

public class Pconstructer {
    String name;
    int age;
    String brand;


     public Pconstructer(String str, int jp, String malo){
        name=str;
        age=jp;
        brand=malo;
    }

    public void display() {
        System.out.println("NAME IS :" + name);
        System.out.println("AGE IS : " + age);
        System.out.println("BRAND IS :"+brand);


    }

    public static void main(String[] args) {

        Pconstructer p = new Pconstructer("harshvardhan", 19, "YADAV");
        p.display();
        Pconstructer p1 = new Pconstructer("Priya", 19, "YADAV");
        p1.display();
        Pconstructer p2 = new Pconstructer("raj", 19, "satnami");
    p2.display();
     }
}
