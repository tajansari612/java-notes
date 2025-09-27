import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

    Node insertAtHead(int data){
        if(this==null){
            this.data = data;
            this.next = null;
            return this;
        }else{
            Node newNode = new Node(data);
            newNode.next = this;
            return newNode;
        }
        // Node head = new Node(data);
        // return head;
    }
    
}
public class _041_CustomLinkedList {
    public static void main(String[] args) {
        // Node head = new Node(4);
        // Node node1 = new Node(5);
        // head.next = node1;
        // Node node2 = new Node(7);
        // node1.next = node2;
        // Node node3 = new Node(11);
        // node2.next = node3;
        // Node node4 = new Node(15);
        // node3.next = node4;
        // Node node5 = new Node(65);
        // node4.next = node5;

        // Node curr = head;
        // while(curr!=null){
        //     System.out.print(curr.data+" ");
        //     curr=curr.next;
        // }
        
        Node head=null;
        head = head.insertAtHead(5);
        head = head.insertAtHead(6);
        head = head.insertAtHead(7);
        head = head.insertAtHead(8);
        head = head.insertAtHead(3);
        head = head.insertAtHead(9);
        head = head.insertAtHead(2);



        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}
