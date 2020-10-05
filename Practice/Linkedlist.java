package Practice;

public class Linkedlist {
	public class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	Node head;
	public void add(int data) {
		Node toadd = new Node(data);
		if(isempty()) {
			head = toadd;
			return;
		}
		Node temp = head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next = toadd;
	}
	public Node removelast() {
		Node temp = head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		Node removed = temp.next;
		temp.next=null;
		return removed;
	}
	public int size() {
		int count = 0;
		Node temp = head;
		while(temp!=null) {
			count+=1;
			temp=temp.next;
		}
		return count;
	}
	public boolean isempty() {
		if(size()==0) {
			return true;
		}else {
			return false;
		}
	}
	public void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public void printlast() {
		Node temp = head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	public static void main(String[] args) {
		Linkedlist myal = new Linkedlist();
		myal.add(12);
		myal.add(13);
		myal.add(43);
		myal.printlast();
	}

}
