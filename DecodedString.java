/*
Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].

 

Example 1:

Input: s = "3[a]2[bc]"
Output: "aaabcbc"
Example 2:

Input: s = "3[a2[c]]"
Output: "accaccacc"
Example 3:

Input: s = "2[abc]3[cd]ef"
Output: "abcabccdcdcdef"
Example 4:

Input: s = "abc3[cd]xyz"
Output: "abccdcdcdxyz"
 

Constraints:

1 <= s.length <= 30
s consists of lowercase English letters, digits, and square brackets '[]'.
s is guaranteed to be a valid input.
All the integers in s are in the range [1, 300].

*/
import java.util.*;

public class DecodedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char encoded[] = sc.next().toCharArray();
        Stack<Character> chars = new Stack<>();
        Stack<Integer> charNum = new Stack<>();
        getDecodedString(encoded, chars, charNum);
        String res = "";
        while (!chars.empty()) {
            res += chars.pop();
        }
        System.out.println(new StringBuilder(res).reverse().toString());
        sc.close();
    }

    private static void getDecodedString(char[] encoded, Stack<Character> chars, Stack<Integer> charNum) {
        for (int i = 0; i < encoded.length; i++) {
            if (Character.isAlphabetic(encoded[i]) || encoded[i] == '[') {
                chars.push(encoded[i]);
            } else if (Character.isDigit(encoded[i])) {
                charNum.push(encoded[i] - '0');
            } else {
                String temp = "";
                while (chars.peek() != '[') {
                    temp += chars.pop();
                }
                chars.pop();
                temp = new StringBuilder(getString(temp, charNum)).reverse().toString();
                for (int j = 0; j < temp.length(); j++) {
                    chars.push(temp.charAt(j));
                }
            }
        }
    }

    private static String getString(String temp, Stack<Integer> charNum) {
        if (!charNum.empty()) {
            int k = charNum.pop();
            String t = temp;
            for (int i = 1; i < k; i++) {
                temp += t;
            }
        }
        return temp;
    }
}

