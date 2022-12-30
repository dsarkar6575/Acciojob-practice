import java.util.*;
class Main {
	Node head;
	Node temp;
	
	class Node {
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	public void oddEvenList(Node head) {
		if (head == null) {
			System.out.println();
			return ;
		}
		Node odd = head, even = head.next, evenHead = even;
		while (even != null && even.next != null) {
			odd.next = even.next;
			odd = odd.next;
			even.next = odd.next;
			even = even.next;
		}
		odd.next = evenHead;
		
		Node temp =head;
		while(temp!=null){
			System.out.print(temp.data);
			System.out.print(" ");
			temp=temp.next;			
		}
		System.out.print("\n");
		return;
	}

	public void push(int new_data)
	{
		if(head == null){
			
			head = new Node(new_data);
			
			temp =head;
			
			return ;
		}
		else{
			Node new_node = new Node(new_data);

			temp.next = new_node;
			
			temp=temp.next;

			return;		
		}	
	}

	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int t=0;
		t = sc.nextInt();
		while(t-->0){
			int n=0;
			Main ob = new Main();
			n=sc.nextInt();
			int tn =n;
			while(tn-->0){
				int x=0;
				x = sc.nextInt();
				ob.push(x);
			}
            ob.oddEvenList(ob.head);
		}
		sc.close();
		return;
	}
}
