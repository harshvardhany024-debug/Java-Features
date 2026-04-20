package A2_non_primitive;

public class DriverEmployeInfo
{
    public static void main(String [] args){

        EmployeInfo E1 =new EmployeInfo();
        E1.Empinputdetails();
        E1.Empprintdetails();
        System.out.println("AFTER UPDATE DESIGNATION ");
        E1.Empupdate();
    }
}
