package dataStructures.Stacks;

public class Stack {
    int[] arr;
    int top;
    int size;

    Stack(int size) {
        this.size = size;
        top = -1;
        arr = new int[size];
    }
    void push(int val) {
        if (top == size - 1) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        arr[top] = val;
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        top--;
    }
    int Top(){
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
 class Driver{
    public static void main(String[] args){
        Stack st = new Stack(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();
    }
 }