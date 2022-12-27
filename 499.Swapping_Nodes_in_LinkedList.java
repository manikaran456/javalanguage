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
    public void swap(int x,int y){
        if(x==y){
            return;
        }
        Node currx=head;
        Node prevx=null;
        while(currx!=null && currx.data!=x){
            prevx=currx;
            currx=currx.next;
        }
        Node curry=head;
        Node prevy=null;
        while(curry!=null && curry.data!=y){
            prevy=curry;
            curry=curry.next;
        }
        if(currx == null || curry == null){
            return;
        }
        if(prevx!=null){
            prevx.next=curry;
        }
        else{
            head=curry;
        }
        if(prevy!=null){
            prevy.next=currx;
        }
        else{
            head=currx;
        }
        Node temp=currx.next;
        currx.next=curry.next;
        curry.next=temp;

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
        ll.swap(4, 8);
        ll.print();
         
    }
}
