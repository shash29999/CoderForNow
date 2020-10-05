package Practice;

public class stack {
	Linkedlist ll = new Linkedlist(); 
	public void push(int data) {
		ll.add(data);
	}
	public void remove() {
		ll.removelast();
	}
	public void peek() {
		ll.printlast();
	}
	public void print() {
		ll.print();
	}
	public static void main(String[] args) {
		stack s = new stack();
		s.push(13);
		s.push(20);
		s.print();
	}

}
