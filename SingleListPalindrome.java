/*Write a java program to determine whether a singly linked list is the palindrome

Sample:
Sample 1:
input=5                                                                                                                       
1 2 3 2 1                                                                                                               
output=
Given singly linked list is a palindrome                                                                                

Sample 2:
input=4                                                                                                                       
7 8 6 1                                                                                                                 
output=
Given singly linked list is not a palindrome                                                                            

*/
import java.util.*;
class Node1
{
    int data;
    Node1 next;
    public Node1(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class SingleListPalindrome
{
    Node1 head=null;
    Node1 tail=null;
    public void addNode1(int data)
    {
        Node1 newNode1 = new Node1(data);
        if(head==null||tail==null)
        {
            head=newNode1;
            tail=newNode1;
            return;
        }
        tail.next=newNode1;
        tail=newNode1;
    }
    
    public boolean isPalindrome()
    {
        Stack<Integer> stack = new Stack<>();
        Node1 curr=head;
        while(curr!=null)
        {
            stack.push(curr.data);
            curr=curr.next;
        }
        Node1 temp=head;
        while(temp!=null)
        {
            if(!stack.isEmpty())
            {
                if(temp.data!=stack.pop())
                {
                    return false;
                }
            }
            temp=temp.next;
            
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        SingleListPalindrome obj = new SingleListPalindrome();
        
        for(int i=0;i<n;i++)
        {
            obj.addNode1(sc.nextInt());
        }
        sc.close();
        if(obj.isPalindrome())
        {
            System.out.println("Given singly linked list is a palindrome");
        }
        else
        {
            System.out.println("Given singly linked list is not a palindrome ");
        }
    }
}