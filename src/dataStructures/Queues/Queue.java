package dataStructures.Queues;

public class Queue {
    int front;
    int back;
    int arr[];
    final int size =20;
    Queue(){
        arr = new int[size];
        front = -1;
        back = -1;
    }
    void push(int x){
        if(back == -1){
            System.out.println("Queue is full");
            return;
        }
        back++;
        arr[back]=x;

        if(front == -1){
            front++;
        }

    }
    void pop(){
        if(front == -1 || front>back){
            System.out.println("Queue is empty");
            return;
        }
        front++;
    }
    int peek(){
        if(front == -1 || front>back){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
    boolean isEmpty(){
        return (front == -1||front==back);
    }
}
