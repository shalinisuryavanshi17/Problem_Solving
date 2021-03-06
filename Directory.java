/*Example 1:
Input: path = "/home/"
Output: "/home"
Explanation: Note that there is no trailing slash after the last directory name.
Example 2:
Input: path = "/../"
Output: "/"
Explanation: Going one level up from the root directory is a no-op, as the root level is the highest level you can go.
Example 3:
Input: path = "/home//foo/"
Output: "/home/foo"
Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.
Example 4:
Input: path = "/a/./b/../../c/"
Output: "/c"
Constraints:
1 <= path.length <= 3000
path consists of English letters, digits, period '.', slash '/' or '_'.
path is a valid absolute Unix path.
*/

import java.util.Arrays;
import java.util.Stack;

public class Directory {
    public static void main(String[] args) {
       String path="/home/";
        System.out.println(solver(path));
    }

    public static String solver(String s){
        Stack<String> stack = new Stack<>();

        String arr[]=s.split("/");
        System.out.println(Arrays.toString(arr));
        for (String element : arr){
            if(element.equals(".")){

            }
            else if(element.equals("..")){
                if(!stack.isEmpty())
                    stack.pop();
            }
            else {
                stack.push(element);
            }

        }

        StringBuilder sb= new StringBuilder();
        for(String d:stack){
            if(!d.equals(""))
                sb.append("/").append(d);
        }
        
        return sb.length()>0?sb.toString():"/";
    }
}