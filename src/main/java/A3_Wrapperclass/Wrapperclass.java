package A3_Wrapperclass;

public class Wrapperclass {
    public static void main (String [] args){
        int x=90;
      Integer iobj=x;// autoboxing
        int y = iobj;//autounboxing

        System.out.println("the pre data type :"+x);
        System.out.println("the autoboxing  :"+iobj);
        System.out.println("the auto unboxing :"+y);

    }
}
