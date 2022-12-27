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
    public void skipMDeleteN(Node head,int m,int n){
        Node curr=head;
        Node t;
        int count;
        while(curr!=null){
            for(count=2;count<=m && curr!=null;count++){
                curr=curr.next;
            }
            if(curr==null){
                return;
            }
            t=curr.next;
            for(count=1;count<=n && t!=null;count++){
                t=t.next;
            }
            curr.next=t;
            curr=t;
        }
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
        ll.skipMDeleteN(head, 2, 2);
        ll.print();
         
    }
}
