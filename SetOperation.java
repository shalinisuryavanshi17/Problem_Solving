/* Write a Java program to find the symmetric difference between two sets

Symmetric Difference = (A u B) - (A n B)
i.e resultant set should not contain common elements of both the sets

Sample:
input = 
5       \\set 1 size
ram
rahim
ajay
rishav
aakash
5       \\set 2 size
aakash
ajay
shyam
ram
ravi

output =
[rahim, ravi,  rishav, shyam]

*/
import java.util.*;
public class SetOperation {
    public static ArrayList<String> l = new ArrayList<>();
    public static void solve(int n,String arr1[],String arr2[])
    {
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if(arr1[i].equals(arr2[j]))
                {
                       l.add(arr1[i]);
                }    
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String arr1[]=sc.nextLine().split(" ");
        String arr2[]=sc.nextLine().split(" ");
        TreeSet<String> s1 = new TreeSet<>();
        for (String s : arr1) {
            s1.add(s);
        }
       
        for (String s : arr2) {
            s1.add(s);
        }
        if(arr1.length>arr2.length)
        {
            solve(arr1.length,arr1,arr2);
        }
        else{
            solve(arr2.length,arr2,arr1);

        }
        System.out.println("set is "+s1);
        System.out.println("List is "+l);
        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < s1.size(); j++) {
                if(s1.contains(l.get(i)))
                {
                    s1.remove(l.get(i));
                }
            }
        }
        
        System.out.println("updated list is "+s1);
    }
}
