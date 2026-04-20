package A4_constructor;

public class thiskeward {
        String name;
        int age;
        String brand;


        public thiskeward(String name, int age, String brand){
            this.name=name;// this keward is use to remove conflict between intace variable and local variable
           this. age=age;
            this.brand=brand;
        }

        public void display() {
            System.out.println("NAME IS :" + name);
            System.out.println("AGE IS : " + age);
            System.out.println("BRAND IS :"+brand);


        }
        public static void main (String[] args){
            thiskeward n = new thiskeward("harsh",19,"yadav");
            n.display();
        }
}
