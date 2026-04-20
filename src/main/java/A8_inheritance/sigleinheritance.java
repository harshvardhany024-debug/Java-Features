package main.java.A8_inheritance;
class a {
    public void up() {
        System.out.println("MAIN  HU A");


    }
}

    class b extends a{
        public void down() {
            System.out.println("jai ho");
        }
    }

public class sigleinheritance {
    public static void main (String [] args){
        System.out.println(" MAIN B KA OBJECT BANAUNGA USKE BAD DONO KE METHODE RUN KARUNGA ");
        b b1 =new b();
        b1.up();
        b1.down();

    }

}
