
/*Write a program to print the following pattern

Example:
input=4
output=
12344321
123**321
12****21
1******1

*/
import java.util.*;

class NumStarPattern {
    public static void getPattern(StringBuilder sb, int ele) {
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != '*') {

                if (Integer.parseInt(String.valueOf(sb.charAt(i))) == ele) {
                    sb.deleteCharAt(i);
                    sb.insert(i, '*');

                }
            } else {
                continue;
            }

        }
        System.out.println(sb);
    }

    public static void main(String args[]) {
        /* Write Code here */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            str += String.valueOf(i + 1);
        }
        sc.close();
        sb.append(str);
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(i + 1);
        }

        System.out.println(sb);
        while (stack.peek() != 1) {
            getPattern(sb, stack.pop());
        }
    }
}
/*
 * test cases: case=1 input=4 output= 12344321 123**321 12****21 1******1
 * 
 * case=2 input= 2 output= 1221 1**1
 * 
 * case=3 input=6 output= 123456654321 12345**54321 1234****4321 123******321
 * 12********21 1**********1
 */