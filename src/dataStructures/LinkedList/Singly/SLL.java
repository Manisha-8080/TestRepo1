package dataStructures.LinkedList.Singly;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SLL {
    Node head;
    SLL(){
        head=null;
    }
    void insertAtHead(int val){
        Node n=new Node(val);
        n.next=head;
        head=n;

    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

}
class DriverCode{
    public static void main(String[] args) {
        SLL s=new SLL();
        s.insertAtHead(10);
        s.insertAtHead(20);
        s.insertAtHead(30);
        s.insertAtHead(40);
        s.display();
    }
}
