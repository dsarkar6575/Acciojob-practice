
import java.util.*;
import java.io.*;
public class Main {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        LinkedList a = new LinkedList();
        LinkedList b = new LinkedList();
        for(int i = 0; i < n; i++){
            a.add(input.nextInt());
        }
        for(int i = 0; i < m; i++){
            b.add(input.nextInt());
        }
        LinkedList ans = new LinkedList();
        Solution A = new Solution();
        ans.head = A.addTwoLinkedLists(a.head, b.head);
        ans.printList();

    }
}


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
    void add(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node curr = head;
        while(curr.next != null)
            curr = curr.next;
        curr.next = new_node;
    }
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
}


class Solution
{

     static Node reverse(Node head)
	{
		Node curr=head;
		Node pre=null;
		while(curr!=null)
			{
				Node next=curr.next;
				curr.next=pre;
				pre=curr;
				curr=next;
			}
		return pre;
	}
    
    public static Node addTwoLinkedLists(Node he1, Node he2)
    {
        //Write your code here
        Node head1=reverse(he1);
        Node head2=reverse(he2);
		Node dummy=new Node(0);
		Node l3=dummy;
		int carry=0;
		while(head1!=null || head2!=null)
			{
			    int h1=(head1!=null)? head1.data: 0;
				int h2=(head2!=null)? head2.data: 0;
				int sum=h1+h2+carry;
				carry=sum/10;
                int l=sum%10;
				Node newNode=new Node(l);
				l3.next=newNode;
				if(head1!=null) head1=head1.next;
				if(head2!=null) head2=head2.next;
				l3=l3.next;
			}

		if(carry>0)
		{
			Node newNode=new Node(carry);
			l3.next=newNode;
            l3=l3.next;
		}
		return reverse(dummy.next);
		
        
    }
    
}
