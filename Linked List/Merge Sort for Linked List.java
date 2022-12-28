import java.util.*;

class Solution {
	 static Node getMid(Node head)
	{
		Node slow=head;
		Node fast=head.next;
		while(fast!=null && fast.next!=null)
			{
				slow=slow.next;
				fast=fast.next.next;
			}
		return slow;
	}
	static Node marge(Node head1,Node head2)
	{
		Node mll=new Node(-1);
		Node temp=mll;

		while(head1!=null && head2!=null)
			{
				if(head1.data<=head2.data)
				{
					temp.next=head1;
					head1=head1.next;
					temp=temp.next;
				}else{
					temp.next=head2;
					head2=head2.next;
					temp=temp.next;
				}
			}
		while(head1!=null)
			{
				temp.next=head1;
					head1=head1.next;
					temp=temp.next;
			}
		while(head2!=null)
			{
				temp.next=head2;
					head2=head2.next;
					temp=temp.next;
			}
		return mll.next;
	}
    public static Node mergesort(Node head){
        //Write your code here
		if(head==null || head.next==null)
		{
			return head;
		}
		Node mid=getMid(head);

		Node Rhead=mid.next;
		mid.next=null;
		Node newL=mergesort(head);
		Node newR=mergesort(Rhead);

		return marge(newL,newR);

    }
}


class Node{
    int data;
    Node next = null;
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
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        LinkedList a = new LinkedList();
        for(int i = 0; i < n; i++){
            a.add(input.nextInt());
        }
        Solution Obj = new Solution();
        a.head = Obj.mergesort(a.head);
        Node h = a.head;
        while(h != null){
            System.out.print(h.data + " ");
            h = h.next;
        }
    }
}
