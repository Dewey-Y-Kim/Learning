package Jv08Collections;
import java.util.Stack;

public class Jv06_StackTest {

	public Jv06_StackTest() {
		// TODO Auto-generated constructor stub
		Stack<String> nameStack = new Stack<>();
		nameStack.push("lee");
		nameStack.push("hong");
		nameStack.push("kim");
		nameStack.push("park");
		nameStack.push("choi");
		nameStack.push("rune");
		nameStack.push("cancer");
		nameStack.push("libra");
		nameStack.push("aquaris");
		while(!nameStack.empty()) {
		System.out.println(nameStack.pop());
		System.out.println(nameStack.size());
		System.out.println(nameStack.toString());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jv06_StackTest();
		
	}

}
