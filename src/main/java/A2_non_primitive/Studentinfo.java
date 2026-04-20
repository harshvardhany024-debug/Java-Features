package A2_non_primitive;

public class Studentinfo {
    public  String stuName;
    public int stuFees;
    public  String clgName;
    public  int stuAge;
    public float stuMarks;

   public void StudentinputDetails(){
       stuName="Harshvardhan yadav";
       stuFees=80000;
       clgName="jai veeru ki jodi";
       stuAge=19;
       stuMarks=89.9f;

   }
   public void studentprintdetails(){
       System.out.println("Name is :"+ stuName);
       System.out.println("Fees is :"+ stuFees);
       System.out.println("College name is :"+ clgName);
       System.out.println("Student age is : "+ stuAge);
       System.out.println("Student marks is :"+ stuMarks);
   }

    public void stuMarks() {
        System.out.println("Student age is : "+ stuAge); }
    public void insertinput(String name, int fees, String clgn,int age,float marks){

        stuName=name;
        stuFees=fees;
        clgName=clgn;
        stuAge=age;
        stuMarks=marks;
}
}
