package main.java.A9_Abstract;
import java.util.Scanner;
public abstract class person {
    String name;
    person(String name){
        this.name=name;

    }
    void intro(){
        System.out.println("the of student is :"+name);
    }
    abstract void study();

}

class student extends person{
    student(String name){
        // student ka construcer jisme parent ke parametr ko supeer keyword use karke call karayenge
super(name);
    }

   void study(){
       System.out.println("i am studying"); }

}

class main{
    public static void main(String[] args) {
        System.out.println("Enter the student name:");
        Scanner sc= new Scanner(System.in);
        String name= sc.nextLine(); //string input methode
        student s= new student(name);
        s.intro();
        s.study();
    }
}
//we use super key word to acces parent constructer