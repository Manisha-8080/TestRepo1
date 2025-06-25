package dataStructures.Stacks.programs;

public class BalancedParenthesis {
    static class MyStack {
        private char[] stack;
        private int top = -1;

        public MyStack(int size) {
            stack = new char[size];
        }

        public void push(char c) {
            stack[++top] = c;
        }

        public char pop() {
            return stack[top--];
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }

    public static boolean isBalanced(String expr) {
        MyStack stack = new MyStack(expr.length());
        for (char ch : expr.toCharArray()) {
            if (ch == '(') stack.push(ch);
            else if (ch == ')') {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("()"));
        System.out.println(isBalanced("(()())"));
        System.out.println(isBalanced("((())"));
        System.out.println(isBalanced("())("));
        System.out.println(isBalanced(""));
    }
}


