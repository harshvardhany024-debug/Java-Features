package A9_Abstract;

public class Driver {
    public static void main(String[] args){
        Dog d1= new Dog();
        d1.sleep();
        d1.animalsound();

        Cat c1 = new Cat();
        c1.sleep();
        c1.animalsound();
        System.out.println("=============================");
        /* very important rule
   WE create a refrence of parent and use costructer of child

         */
        System.out.println(" ========================================== ");
        Animal a1= new Dog();
        a1.animalsound();
        a1.sleep();

        System.out.println("==============================");
        Animal b1= new Cat();
        b1.sleep();
        b1.animalsound();
    }
}
