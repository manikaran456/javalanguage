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

    public static void print(){
        Node temp=head;
        
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.println("null");

    }
    
    public static Node mergeklists(Node a[],int start,int end){
        if(a.length==0){
            return null;
        }
        if(start==end){
            return a[start];
        }
        int mid = start +(end-start)/2;
        Node left=mergeklists(a, start, mid);
        Node right=mergeklists(a, mid+1, end);

        return merge(left,right);
    }
    public static Node merge(Node left,Node right){
        Node mergedll=new Node(-1);
        Node temp=mergedll;
        while(left!=null && right!=null){
            if(left.data<=right.data){
                temp.next=left;
                left=left.next;
                temp=temp.next;
            }
            else{
                temp.next=right;
                right=right.next;
                temp=temp.next;
            }
        }
        while(left!=null){
            temp.next=left;
            left=left.next;
            temp=temp.next;
        }
        while(right!=null){
            temp.next=right;
            right=right.next;
            temp=temp.next;
        }
        return mergedll.next;
    }
    
    
    public static void main(String args[]){
        int k=3;
        Node a[]=new Node[k];
        a[0]=new Node(1);
        a[0].next=new Node(3);
        a[0].next.next=new Node(4);
        a[0].next.next.next=new Node(5);
        a[0].next.next.next.next=null;

        a[1]=new Node(6);
        a[1].next=new Node(7);
        a[1].next.next=new Node(8);
        a[1].next.next.next=null;

        a[2]=new Node(9);
        a[2].next=new Node(10);
        a[2].next.next=new Node(11);
        a[2].next.next.next=null;
        head=mergeklists(a, 0, k-1);
        print();
        
        

        
         
    }
}
