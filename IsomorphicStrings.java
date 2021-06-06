import java.util.*;
public class IsomorphicStrings {
    public static boolean isIsomorphic(String str1,String str2)
    {
        if(str1.length()!=str2.length())
        {
            return false;
        }
        int notUniqueInStr1=0;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = i+1; j < str1.length(); j++) {
                if(str1.charAt(i)==str1.charAt(j))
                {
                       notUniqueInStr1++;
                }
            }
        }
        int notUniqueInStr2=0;
        for (int i = 0; i < str2.length(); i++) {
            for (int j = i+1; j < str2.length(); j++) {
                if(str2.charAt(i)==str2.charAt(j))
                {
                       notUniqueInStr2++;
                }
            }
        }
        if(notUniqueInStr1==notUniqueInStr2)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        System.out.println(isIsomorphic(str1,str2));
    }
}
