import java.util.Stack;

public class LC155_MinStack {
    Stack<Integer> stack = new Stack<>();
    public void MinStack() {
        Stack<Integer> stack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

//    public int getMin() {
//    }

    class Node{
        int val;
        int min;

    }
}
