import java.util.*;

public class Test3 {
    static int wordcount(String string) {

        int count = 0;
        // String arr[]=string.split(" ");
        // System.out.println("no of words in array is "+arr.length);

        char ch[] = string.toCharArray();
        System.out.println("the array is "+Arrays.toString(ch));
        for (int i = 0; i < ch.length; i++) {
        
            if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str=sc.next();
        // char arr[]=str.toCharArray();
        // String res="";
        // for (int i = 0; i < arr.length; i++) {
        // if(arr[i]>=65 && arr[i]<=90 )
        // {
        // String s=Character.toString(arr[i]).toLowerCase();
        // res+=s;
        // }
        // else if(arr[i]>=97 && arr[i] <=122 ){
        // String s=Character.toString(arr[i]).toUpperCase();
        // res+=s;
        // }
        // }
        System.out.println("words in array is " + wordcount("India is my country"));
    }

}
