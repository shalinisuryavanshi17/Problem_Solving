import java.util.*;
public class FindMinDelInString {
    public static int getMinDeletions(String str)
    {
        char arr[]= str.toCharArray();
        int start=0;
        int end=arr.length-1;
        int count=1;
        if(arr.length==1)
        {
            return 0;
        }
        while(start<end) {
            if(arr[start]!=arr[end])
            {
                count++;
            }
            start++;
            end--;
        }
        return count;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str=sc.next();
    System.out.println("the minimum no of deletions required are "+getMinDeletions(str));
    sc.close();
}    
}
