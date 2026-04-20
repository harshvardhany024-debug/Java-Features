package A2_non_primitive;

public class DriverStudentinfo {
    public static void main(String [] args){
        Studentinfo student_1 = new Studentinfo();
        student_1.StudentinputDetails();
  student_1.studentprintdetails();
  student_1.stuMarks();
        System.out.println("the details of student 2 is same aas 1");
  Studentinfo student_2 = new Studentinfo();
  student_2=student_1;
  student_2.studentprintdetails();

  Studentinfo student_3 =new Studentinfo();
  // mere ko yaha khud ki value update karni hai to main ek naya function banauga

            String name="Priya ";
            int fees=40000;
            String clgn="Aiims Raipur";
            int age=19;
float marks=97.7f;
        System.out.println("STUDENT 3  DETAILS");
student_3.insertinput( name ,fees,clgn, age,marks);
student_3.studentprintdetails();
        }
    }

