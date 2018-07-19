
import java.util.Stack;
import java.util.LinkedList;

class UseStacks {


	public static void main(String[] args) {

	Stack<String> stack = new Stack<String>();
	stack.push("Anthony");
	stack.push("Jennifer");
	stack.push("Joanne");

	System.out.println(stack);
	while(!stack.isEmpty()) {
		System.out.println(stack.peek());
		stack.pop();
		}
	}

}
