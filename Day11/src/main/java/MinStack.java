import java.util.Stack;

public class MinStack {
    Stack<Node> stack;
    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.empty()){
            Node node = new Node(val, val);
            stack.push(node);
        } else {
            Node peek = stack.peek();
            int min = Math.min(val,peek.min);
            Node node = new Node(val, min);
            stack.push(node);
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().val;
    }

    public int getMin() {
        return stack.peek().min;
    }
    public class Node{
        int val;
        int min; //Present Min of Stack
        Node(int val, int min){
            this.val= val;
            this.min = min;
        }

    }
}
