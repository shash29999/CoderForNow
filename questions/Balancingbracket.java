package questions;
import java.util.*;
public class Balancingbracket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		String s = sc.next();
		boolean check = true;
		for(int i=0;i<s.length();i++) {
			char x = s.charAt(i);
			if(x=='(' || x=='{' || x=='[' ) {
				stack.push(x);
				continue;
			}
			if(stack.empty()) {
				check = false;
				break;
			}
			if(x==')') {
				if(stack.peek()=='(') {
					stack.pop();
				}else {
					check=false;
					break;
				}
			}
			if(x==']') {
				if(stack.peek()=='[') {
					stack.pop();
				}else {
					check=false;
					break;
					}	
			}
			if(x=='}') {
				if(stack.peek()=='{') {
					stack.pop();
				}else {
					check=false;
					break;
				}
		
			}
			}
		if(!stack.empty())
			check=false;
		if(check==true) {
			System.out.println("bal");
		}else {
			System.out.println("not");
		}
}
}
