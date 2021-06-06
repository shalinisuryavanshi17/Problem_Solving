import java.util.*;
public class FibDp {
    //0 1 1 2 3 5
    public static int fibWithRecursion(int n)
    {
        if(n<2)
        {
            return n;
        }
        
        return fibWithRecursion(n-1)+fibWithRecursion(n-2);
    }
    //top down approach
    public static int fibTopDown(int n)
    {
        int memory[]=new int[n+1];
        if(n<2)
        {
            return n;
        }
        if(memory[n]!=0)
        {
            return memory[n];
        }
        return memory[n]=fibTopDown(n-1)+fibTopDown(n-2);
    }
    //bottom up approach
    public static int  fibWithBottomUp(int n )
    {
        int memory[]= new int[n+1];
        memory[0]=0;
        memory[1]=1;
        for (int i = 2; i <=n; i++) {
            memory[i]=memory[i-1]+memory[i-2];
        }
        return memory[n];
    }
    //efficient solution
    public static int fibSolution(int n )
    {
        int first=0,second=1,sum=0;
        for (int i = 2; i <=n; i++) {
            sum=first+second;
            first=second;
            second=sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("efficient solution "+fibSolution(n));
        System.out.println("recursive solution "+fibWithRecursion(n));
        System.out.println("top down solution "+fibTopDown(n));
        System.out.println("bottom up solution "+fibWithBottomUp(n));
        
        sc.close();
    }
}
