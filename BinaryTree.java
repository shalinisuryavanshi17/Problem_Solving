import java.util.*;
class Tree
{
    class Node
    {
        
    int data;
   
    Node leftChild;
    Node rightChild;
    Node(int data)
    {
        this.data=data;
    }
    }
     Node root;
    public void insertNode(int data)
    {
        Node newNode = new Node(data);
        if(root==null)
        {
            root=newNode;
            return;
        }
        Node curr=root;
        while(true)
        {
            if(data<curr.data)
            {
                if(curr.leftChild==null)
                {
                    curr.leftChild=newNode;
                    break;
                }
                curr=curr.leftChild;
                
            }
            else
            {
                if(curr.rightChild==null)
                {
                    curr.rightChild=newNode;
                    break;
                }
                curr=curr.rightChild;
                
            }
        }
    }
    public void bft()
    {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            Node node=q.poll();
            System.out.print(node.data+" ");
            if(node.leftChild!=null)
            {
                q.offer(node.leftChild);
            }
            if(node.rightChild!=null)
            {
                q.offer(node.rightChild);
            }
        }
        }
        public void dft()
    {
        Stack<Node> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty())
        {
            Node node=s.pop();
            System.out.print(node.data+" ");
            if(node.leftChild!=null)
            {
                s.push(node.leftChild);
            }
            if(node.rightChild!=null)
            {
                s.push(node.rightChild);
            }
        }
        }
        public void preOrder()
{
    if(root==null)
    {
        return;
    }
    preOrder(root);
}
private void preOrder(Node root)
{
    Node curr=root;
    System.out.print(curr.data+" ");
    if(curr.leftChild!=null)
    {
        preOrder(curr.leftChild);
    }
    if(curr.rightChild!=null)
    {
        preOrder(curr.rightChild);
    }
}
        public void postOrder()
{
    if(root==null)
    {
        return;
    }
    postOrder(root);
}
private void postOrder(Node root)
{
    Node curr=root;
    
    if(curr.leftChild!=null)
    {
        postOrder(curr.leftChild);
    }
    if(curr.rightChild!=null)
    {
        postOrder(curr.rightChild);
    }
    System.out.print(curr.data+" ");
}
        public void inOrder()
{
    if(root==null)
    {
        return;
    }
    inOrder(root);
}
private void inOrder(Node root)
{
    Node curr=root;
    
    if(curr.leftChild!=null)
    {
        inOrder(curr.leftChild);
    }
    System.out.print(curr.data+" ");
    if(curr.rightChild!=null)
    {
        inOrder(curr.rightChild);
    }
    
}
 //delete  nodes
 public void deleteNodes(int data)
 {
     if (root==null)
     {
         return;
     }
     deleteNode(root,data);
 }
 private Node deleteNode(Node root,int data)
 {
     Node curr=root;
     if(curr==null)
     {
         return null;
     }
     //traversing based on data either to left or right
     if(data<curr.data)
     {
         curr.leftChild=deleteNode(curr.leftChild,data);
     }
     else if(data>curr.data)
     {
         curr.rightChild=deleteNode(curr.rightChild,data);
     }
     else
     {    //deleting leaf node
         if(curr.leftChild==null && curr.rightChild==null)
         {
             curr=null;
         }
         else if(curr.leftChild==null)//deleting node which has one rightchild 
         {
             Node temp=curr;
             curr=curr.rightChild;
             temp=null;
         }
         else if(curr.rightChild==null)//deleting node which has one leftchild
         {
             Node temp=curr;
             curr=curr.leftChild;
             temp=null;
         }
         else
         {
             //delete node which has both left and right children
             Node temp=findMax(curr.rightChild,Integer.MIN_VALUE); //finding max from right sub tree
             curr.data=temp.data;//replacing the data
              curr.rightChild=deleteNode(curr.rightChild,temp.data);//again checking for delete condition and deleting
         }
         
     }
     //returning the updated root
     return curr;
 }
 private Node findMax(Node root,int val)//getting max value from right sub tree
 {
     Node curr=root;
     int max=val;
     if(curr!=null)
     {
     if(max<curr.data)
     {
         max=curr.data;
     }
     curr.rightChild=findMax(curr.rightChild,max);
     }
     
     return curr;
 }
}

class BinaryTree
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Tree t=new Tree();
        for(int i=0;i<n;i++)
        {
            t.insertNode(sc.nextInt());
        }
        System.out.print("Breath First traversal -->");t.bft();
        System.out.println();
        System.out.print("depth First traversal -->");t.dft();
        System.out.println();
        System.out.print("preOrder traversal -->");t.preOrder();
        System.out.println();
        System.out.print("inOrder traversal -->");t.inOrder();
        System.out.println();
        System.out.print("postOrder traversal -->");t.postOrder();
        System.out.println();
        System.out.println("enter node data to delete -->");
        t.deleteNodes(sc.nextInt());
        System.out.print("after delete operations the tree is -->");
        System.out.println();
        t.bft();
    }
}
