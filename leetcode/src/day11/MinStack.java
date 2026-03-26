package day11;

import java.util.Stack;

public class MinStack {
    static void main() {
        MinStack minStack = new MinStack();

        minStack.push(5);
        minStack.push(3);
        minStack.push(7);
        minStack.push(2);

        System.out.println("Top: " + minStack.top());      // 2
        System.out.println("Min: " + minStack.getMin());   // 2

        minStack.pop(); // removes 2

        System.out.println("Top after pop: " + minStack.top());   // 7
        System.out.println("Min after pop: " + minStack.getMin()); // 3
    }

    Stack<Integer> s = new Stack<>();
    Stack<Integer> m = new Stack<>();


    public void push(int val) {
        s.push(val);
        if (m.isEmpty() || val <= m.peek()) {
            m.push(val);
        }
    }

    public void pop() {
        int popvalue = s.pop();
        if (popvalue == m.peek()) {
            m.pop();
        }
    }

    public int top() {
        if (s.isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return s.peek();
    }

    public int getMin() {
        return m.peek();
    }
}

