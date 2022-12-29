import java.io.*;
import java.util.*;
 
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data ){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node current = head;
        while(current.next !=null){
            current = current.next;
        }
        current.next = new_node;
    }
}

class Solution {
 static Node merge(Node x, Node y){
       // Write your code here
	 if(x==null)
	 {
		 return y;
	 }
	 if(y==null)
	 {
		 return x;
	 }
	 Node AnsHead;
	 if(x.data<y.data)
	 {
		 AnsHead=x;
		 x=x.next;
	 }
	 else{
		 AnsHead=y;
		 y=y.next;
	 }
	 Node temp=AnsHead;
	 while(x!=null && y!=null)
		 {
			 if(x.data<=y.data)
			 {
				 temp.next=x;
				 x=x.next;
				 temp=temp.next;
			 }else{
				 temp.next=y;
				 y=y.next;
				 temp=temp.next;
			 }
		 }
	 while(x!=null)
		 {
			 temp.next=x;
			 x=x.next;
			 temp=temp.next;
		 }
	 while(y!=null)
		 {
			 temp.next=y;
			 y=y.next;
			 temp=temp.next;
		 }

	 return AnsHead;
    }
}

public class Main {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList l1= new LinkedList();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        int m = sc.nextInt();
        LinkedList l2 = new LinkedList();
        for(int i=0;i<m;i++){
            l2.add(sc.nextInt());
        }

        Solution Ob = new Solution();
        Node head = Ob.merge(l1.head, l2.head);
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
