package A5_copyobjects;

public class Driverstu {
    public static void main(String[] args) {

        Studentc s =new Studentc();
 s.name="harshvardhan yadav";
       // System.out.println("NAME IS "+s.name);
Studentc s2=  s; // copying refrence not object
        System.out.println("s2 name is "+s2.name);
        Studentc s3 =new Studentc();
        s3.name=s2.name;
        System.out.println("s3 name is "+ s3.name);
    }
}
