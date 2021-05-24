/* Write a java program to perform following operations on Circular Linked list

1. Insert a node at beginning and at the end of the CLL.
2. Delete a node at beginning and at the end of the CLL.

Example 1:
6         \\Size of list                                                                                                              
1 2 3 4 5 6             \\elements of the list (add at the end of list)                                                                                                
Circular Linked List: 1 2 3 4 5 6                                                                                       
Enter an element to add at beginning of the list: 10                                                                    
Updated Circular Linked List: 10 1 2 3 4 5 6                                                                            
Circular Linked List after deleting last element: 10 1 2 3 4 5                                                          
Circular Linked List after deleting first element: 1 2 3 4 5                                                            

Example 2:
1                                                                                                                       
25                                                                                                                      
Circular Linked List: 25                                                                                                
Enter an element to add at beginning of the list: 50                                                                    
Updated Circular Linked List: 50 25                                                                                     
Circular Linked List after deleting last element: 50                                                                    
Circular Linked List after deleting first element: List is empty                                                        
                                                                                                                        
*/
import java.util.Scanner;
//create Node class


 class CLL 
{
     class Node
{
    int data;
    Node next;
    Node(int data,Node next)
    {
        this.data=data;
        this.next=next;
    }
}

    Node head=null;
    Node tail=null;
	//declare required data memebers
	
	
  
    //write addAtStart() to add a new node to the beginning of the list  
    public void addAtStart(int data)
    {
        Node newNode= new Node(data,null);
        if(head==null)
        {
            head=newNode;
        }
        newNode.next=head;
        head=newNode;
        tail.next=head;
    }
	
	
	//write addAtEnd() to add a new node to the end of the list  
    public void addAtEnd(int data)
    {
        Node newNode= new Node(data,null);
        if(tail==null || head==null)
        {
            head=newNode;
            tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
        tail.next=head;
    }
    
      
	//write deleteFromStart() to delete a node from the beginning of the list  
	 public void deleteFromStart()
    {
        if(head==null)
        {
            System.out.print("list is empty");
        }
        Node temp=head.next;
        head.next=null;
        head=temp;
        tail.next=head;
       
        
    }
	 
    
    //write deleteFromEnd() to delete a node from end of the list  
    public void deleteFromEnd()
    {
        Node last=tail;
        last.next=null;
        Node temp=head;
        if(tail!=null)
        {
            while(temp.next!=last)
            {
                temp=temp.next;
            }
            temp.next=head;
            tail=temp;

        }
        System.out.println("List is empty");
       
    }
    public int count()
    {
        int count=0;
        Node curr=head;
        while(curr.next!=head)
        {
            count++;
        }
        count++;
        if(count==1)
        {
            head=null;
            tail=null;
            //System.out.println("list is empty");
        }
        return count;
    }
    
    //write display() to display the list	
	public void display()
	{
	    Node current=head;
        if(head==null||tail==null)
        {
            System.out.println("list is empty");
        }
	    while(current.next!=head)
	    {
	        System.out.print(current.data+" ");
	        current=current.next;
	    }
        System.out.print(current.data);
        System.out.println();
	}
	  
  
     
} 
class CircularList
{
    public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		
		CLL list = new CLL(); 
		for(int i=0;i<n;i++)
		    list.addAtEnd(sc.nextInt());
	    
	    System.out.print("Circular Linked List: ");
	    list.display();
	    
	    System.out.println("Enter an element to add at beginning of the list: ");
	    int e1=sc.nextInt();
	    list.addAtStart(e1);
	    
	    System.out.println("Updated Circular Linked List: ");
	    list.display();
	    
	   System.out.println("Circular Linked List after deleting last element: ");
	   list.deleteFromEnd();
	   list.display();
	    
	   System.out.println("Circular Linked List after deleting first element: ");
	   list.deleteFromStart();
    //    if(list.count()==0)
    //    {
    //        System.out.println("List is empty");
    //    }
	   list.display();
       //System.out.println("count is "+list.count());
    } 
}