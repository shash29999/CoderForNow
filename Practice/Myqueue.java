package Practice;
import java.util.*;

public class Myqueue {
	public class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	Node head,rear;
	public void enqueue(int data) {
		Node toadd = new Node(data);
		if(head==null) {
			rear=head=toadd;
			return;
		}
		rear.next=toadd;
		rear = rear.next;
	}
	public Node dequeue() {
		if(head==null) {
			return null;
		}
		Node temp =head;
		if(head==null) {
			rear=null;
		}
		head=head.next;
		return temp;
	}
	public void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Myqueue q = new Myqueue();
		q.enqueue(10);
		q.enqueue(20);
		q.print();
		System.out.print(q.dequeue().data);
	}
}
