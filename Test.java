import java.util.HashMap;
import java.util.Map;

class A
{   static
    {
        System.out.print("static");
    }
    {
        System.out.println("block");
    }
    A()
    {
        System.out.println("A");
    }
    public int add(int i,int j)
    {
        return i+j;
    }
}
public class Test {
    public static void go(Short s)
    {
        System.out.println("short");
    }
    public static void main(String[] args) {
       A obj = new A();
       short a=3;
       int b=9;
       System.out.println(obj.add(a, b));
       short s=2;
       go(s);
    }
}
