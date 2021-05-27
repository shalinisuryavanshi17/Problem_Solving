public class RecursionTest
{
  public static int calc(int n)
  {
    // base case
    if(n == 0)
    {
      return 1;
    }
    
    /*
    recursive case
      Point 1: The recursive call puts the current function "on pause"
      Point 2: Every function call maintains its own copy of local vars
      Point 3: After the base case has been hit, each function that is
               "on pause" needs to return before the original call returns.
    */
    int temp = 10 + calc(n-1);
    
    return temp;
  }
  
  public static void main(String[] args)
  {
    int result = calc(2);       // kicks off the recursive function
    System.out.println(result); // prints 21
  }
}
