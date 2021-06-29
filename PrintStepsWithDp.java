/*

You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

*/
import java.util.*;
class PrintStepsWithDp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dp[] = new int[n+1];
        System.out.println(printSteps(n,dp));
    }
    public static int printSteps(int n,int[] dp)
    {
        if(n <= 1) return 1;
        if(dp[n]>0) return dp[n];
        int op1 = printSteps(n-1,dp);
        int op2 = printSteps(n-2,dp);
        dp[n]=op1+op2;
       return dp[n];
    }
}
