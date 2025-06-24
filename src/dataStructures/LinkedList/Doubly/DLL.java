package dataStructures.LinkedList.Doubly;
class Node{
    char data;
    Node next;
    Node prev;
    Node(char data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public class DLL {
    Node head;
    DLL(){
        head=null;
    }
    void insertAtHead(char val){
        Node n=new Node(val);
        if(head!=null){
            head.prev=n;
        }
        n.next=head;
        head=n;
    }
     void rotateByN(int N){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        head.prev=temp;

        while(N-- > 0){
            head=head.next;
            temp=temp.next;
        }
        temp.next=null;
        head.prev=null;

     }

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

}
class DriverCode{
    public static void main(String[] args) {
        DLL d= new DLL();
        int N=4;
        d.insertAtHead('e');
        d.insertAtHead('d');
        d.insertAtHead('c');
        d.insertAtHead('b');
        d.insertAtHead('a');
        d.display();
        d.rotateByN(N);
        d.display();
    }
}

