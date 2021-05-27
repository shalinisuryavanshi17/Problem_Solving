
/*

Given an integer array element, construct a binary search tree(BST), and print the level order.
Complete the given code : 

	
Example:
Input: [7,4,15,1,5,3,12,6]
Output: 7,4,15,1,5,12,3,6


*/
import java.util.*;

class Tree {
	private class Node {
		private int data;
		private Node leftChild;
		private Node rightChild;

		Node(int data) {
			this.data = data;
		}

	}

	private Node root;

	public void insert(int value) {
		// Write your code
		Node node = new Node(value);
		if (root == null) {
			
			root=node;
			return;
		}
		Node curr = root;
		while (true) {
			if (value > curr.data) {
				if (curr.rightChild != null) {
					curr = curr.rightChild;
					break;
				}
				else{
					curr.rightChild= node;
					
	
				}
				
			} else {
				if (curr.leftChild != null) {
					curr = curr.leftChild;
				}
				else{
					curr.leftChild = node;
					break;
				}
				
			}
		}
	}

	public void printLevelOrder() {
		// Write your code
		Node current = root;
		while (current.leftChild != null || current.rightChild != null) {
			System.out.print( current.rightChild.data);
		}
	}

}

public class BinaryTree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tree t = new Tree();
		int n = sc.nextInt();
		int arr[] = new int[n];
		int i;
		for (i = 0; i < arr.length; i++) {
			t.insert(sc.nextInt());
		}
		t.printLevelOrder();
		// Use Scanner class
		// Write your code
		// user t.insert and t.printLevelOrder methods
	}
}