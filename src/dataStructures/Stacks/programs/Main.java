package dataStructures.Stacks.programs;
class TwoStacks {
    private int[] arr;
    private int top1, top2;

    public TwoStacks(int size) {
        arr = new int[size];
        top1 = -1;
        top2 = size;
    }

    public void push1(int val) {
        if (top1 + 1 < top2) arr[++top1] = val;
        else System.out.println("Stack Overflow");
    }

    public void push2(int val) {
        if (top1 + 1 < top2) arr[--top2] = val;
        else System.out.println("Stack Overflow");
    }

    public void pop1() {
        if (top1 >= 0) System.out.println(arr[top1--]);
        else System.out.println("Stack Underflow");
    }

    public void pop2() {
        if (top2 < arr.length) System.out.println(arr[top2++]);
        else System.out.println("Stack Underflow");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Test Case 1:");
        TwoStacks ts1 = new TwoStacks(5);
        ts1.push1(5);
        ts1.push1(3);
        ts1.push2(7);
        ts1.pop1();
        ts1.pop2();
        ts1.pop2();

        System.out.println("\nTest Case 2:");
        TwoStacks ts2 = new TwoStacks(5);
        ts2.push1(1);
        ts2.push2(2);
        ts2.pop1();
        ts2.push1(3);
        ts2.pop1();
        ts2.pop1();
    }
}

