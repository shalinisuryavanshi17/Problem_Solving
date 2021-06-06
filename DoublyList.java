/*Given N integers, store them in a doubly linked list. 
Write a Java program to insert an element from beginning, middle and 
end of the doubly linked list.

Example:
5		\\size of list
2 8 6 4 9	\\elements of list (add at the end)
Doubly Linked List: 2 8 6 4 9
Enter an element to add at beginning of the list: 10
Updated Doubly Linked List: 10 2 8 6 4 9
Enter an element to add in the middle of the list: 5
Updated Doubly Linked List: 10 2 8 5 6 4 9
*/

import java.util.Scanner;


class Node2
{  
	int data;  
	Node2 prev;  
	Node2 next;  
	public Node2(int data) 
	{  
		this.data = data;  
	}  
}
public class DoublyList
{  
    Node2 head, tail = null;  
    int size;
	
	/* Write code here*/
	
    public static void main(String[] args) 
	{  
		Scanner sc=new Scanner(System.in);
        DoublyList list = new DoublyList();  
		
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
			list.addAtEnd(sc.nextInt());
		
		System.out.print("Doubly Linked List: ");
	    list.display();
	    
		System.out.print("Enter an element to add at beginning of the list: ");
	    int e1=sc.nextInt();
	    list.addAtStart(e1);
	    System.out.print("Updated Doubly Linked List: ");
	    list.display();
	    
		System.out.print("Enter an element to add in the middle of the list: ");
	    int e2=sc.nextInt();
	    list.addInMid(e2);
	    System.out.print("Updated Doubly Linked List: ");
	    list.display();
      sc.close();   
    }

   

    private void addAtStart(int e1) {
        Node2 newNode= new Node2(e1);
        if(head==null)
        {
          head=newNode;
          tail=newNode;
          return;
        }
        Node2 curr=head;
        newNode.next=curr;
        curr.prev=newNode;
        head=newNode;

    }

    private void display() {
        Node2 curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    private void addInMid(int data)
	{
	    Node2 newNode = new Node2(data);
        int pos=3;
        int i=0;
        Node2 curr=head,next=null;
        while(i<pos-1)
        {
            curr=curr.next;
            i++;
        }
        next=curr.next;
        curr.next=newNode;
        newNode.prev=curr;
        newNode.next=next;
        next.prev=newNode;
	}

    private void addAtEnd(int nextInt) {
        Node2 newNode= new Node2(nextInt);
        if(tail==null)
        {
          head=newNode;
          tail=newNode;
          return;
        }
        Node2 last=tail;
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
        
    }  
}  

/*Test cases:
case=1
input=5
2 8 6 4 9
10
5
output=
Doubly Linked List: 2 8 6 4 9
Enter an element to add at beginning of the list: 
Updated Doubly Linked List: 10 2 8 6 4 9
Enter an element to add in the middle of the list: 
Updated Doubly Linked List: 10 2 8 5 6 4 9

case=2
input=2
10 20
-5
-25
output=
Doubly Linked List: 10 20
Enter an element to add at beginning of the list: 
Updated Doubly Linked List: -5 10 20
Enter an element to add in the middle of the list: 
Updated Doubly Linked List: -5 10 -25 20

*/

