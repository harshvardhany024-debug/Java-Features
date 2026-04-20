package A2_non_primitive;

public class EmployeInfo
{
    public String EmpName ;
    public int EmpSalery;
    public  String Empdept;
    public  String EmpDesigantion;
    public String EmpuPDesigantion;
    public  int Empage;

    public void Empinputdetails(){
        EmpName="Harshvardhan yadav";
        EmpSalery=10000000;
        Empdept="Cse(AI)";
        EmpDesigantion="Maneger";
        Empage=19;
        EmpuPDesigantion="SeniourManager";


    }
    public void  Empprintdetails(){
        System.out.println("NAME IS : "+EmpName);
        System.out.println("SALARY IS : "+ EmpSalery);
        System.out.println("DEPARTMENT IS :"+ Empdept);
        System.out.println("DESIGANTION IS :"+ EmpDesigantion);
        System.out.println("AGE IS : "+Empage);


    }
    public void Empupdate(){
        System.out.println("NAME IS : "+EmpName);
        System.out.println("SALARY IS : "+ EmpSalery);
        System.out.println("DEPARTMENT IS :"+ Empdept);
        System.out.println("DESIGANTION IS :"+ EmpuPDesigantion);
        System.out.println("AGE IS : "+Empage);

    }
}
