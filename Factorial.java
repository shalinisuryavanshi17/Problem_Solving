import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));
        sc.close();
    }
    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int f=n*fact(n-1);
        return f;
    }
}
