package A1_primitive;

public class PrimitiveExample {
             private byte b;
    private short s;
    private int i;
    private long l;
    private float f;
    private double d;
    private char c;
    private boolean status;

    public void InputforPDT(){
        b=100;
        s=2000;
        i=40000;
        l=90000;
        f=34.56f;
        d=456.78;
        c='m';
    }
public void  PrintDetailsforPDT(){
        System.out.println("Byte value is : "+b);
        System.out.println("Short is: "+ s);
    System.out.println("Integer is : "+ i);
    System.out.println("Long is :"+ l);
    System.out.println("Float is :"+f);
    System.out.println("Double is : "+ d);
    System.out.println("Char is : "+ c);
}
}
