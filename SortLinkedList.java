/*Write a java program to sort the elements of the singly linked list

Sample:
Input=
6
82 25 53 61 42 76
Output=
25 42 53 61 76 82

*/
import java.util.*;
class Node
{  
	int data;  
	Node next;  
	public Node(int data) 
	{  
		this.data = data;  
		this.next = null;  
	}  
} 
public class SortLinkedList
{  
    public Node head = null;  
    public Node tail = null;  
    PriorityQueue<Integer> min = new PriorityQueue<>(new Comparator<Integer>(){
        public int compare(Integer a,Integer b)
        {
            return Integer.compare(a,b);
        }
     });
    
    //Write addNode() which will add a new node to the list
    public void addNode(int data)
    {
        Node newNode = new Node(data);
        if(head==null||tail==null)
        {
            head=newNode;
            tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
        
    }
    
    //write sortList() which will sort nodes of the list in ascending order  
       public void sortList()
       {
           Node curr=head;
           while(curr!=null)
           {
              
               min.offer(curr.data);
               curr=curr.next;
           }
           Node temp=head;
           while(temp!=null)
           {
              
               temp.data=min.poll();
               temp=temp.next;
           }
       }
      
    //write display() which will display all the nodes present in the list  
    public void display()
    {
        Node curr=head;
        while(curr!=null)
           {
              
               System.out.print(curr.data+" ");
               curr=curr.next;
           }
    }
      
    public static void main(String[] args) 
	{  
        Scanner sc=new Scanner(System.in);  
        SortLinkedList list = new SortLinkedList();  
        int n=sc.nextInt();
		for(int i=0;i<n;i++)
			list.addNode(sc.nextInt());
        
        list.sortList();  
        list.display();  
    }  
} 

/*Test cases:
case=1
Input=6
82 25 53 61 42 76 32
Output=
25 32 42 53 61 76 82

case=2
Input=4
56 42 12 32
Output=
12 32 42 56
*/