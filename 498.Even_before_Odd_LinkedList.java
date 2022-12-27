import java.util.*;

public class DoublyLL{
    
    public static class Node{
        int data;
        Node next;
        

        public Node(int data){
            this.data=data;
            this.next=null;
            
        }
    }
    
    public static Node head;
    public static Node tail;

    public void addLast(int data){
        
        Node n=new Node(data);
        if(head==null){
            head=tail=n;
        }
        tail.next=n;
        tail=n;
    }
    public void print(){
        Node temp=head;
        
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.println("null");

    }
    
    public Node evenOdd(Node head){
        Node dummyeven=new Node(-1);
        Node even=dummyeven;
        Node dummyodd=new Node(-1);
        Node odd=dummyodd;
        Node curr=head;
        while(curr!=null){
            if(curr.data %2 !=0){
                odd.next=curr;
                odd=odd.next;
            }
            else{
                even.next=curr;
                even=even.next;
            }
            curr= curr.next;
        }
        odd.next=null;
        even.next=dummyodd.next;

        return dummyeven.next;
    }
    
    
    public static void main(String args[]){
        DoublyLL ll= new DoublyLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.addLast(9);
        ll.addLast(10);
        ll.print();
        head=ll.evenOdd(head);
        ll.print();
         
    }
}
