import java.util.*;

public class DoublyLL{

    public static int area(int a[]){
        int nsr[]=new int[a.length];
        int nsl[]=new int[a.length];
        Stack<Integer> s= new Stack<>();
        //next smallest right
        for(int i=a.length-1;i>=0;i--){
            int curr=a[i];
            while(!s.isEmpty() && curr<=a[s.peek()]){
                s.pop();
            }
            if(s.isEmpty())
            nsr[i]=a.length;
            else
            {
                nsr[i]=s.peek();
            }
            s.push(i);

        }
        s= new Stack<>();
        //next smallest left
        for(int i=0;i<a.length;i++){
            int curr=a[i];
            while(!s.isEmpty() && curr<=a[s.peek()]){
                s.pop();
            }
            if(s.isEmpty())
            nsl[i]=-1;
            else
            {
                nsl[i]=s.peek();
            }
            s.push(i);

        }
        int maxarea=0;
        // calculating area 
        for(int i=0;i<a.length;i++){
            int curr=a[i]*(nsr[i]-nsl[i]-1);
            maxarea=Math.max(maxarea, curr);
        }
        return maxarea;
        

    }
    
    
    public static void main(String args[]){
        int arr[]={2,1,5,6,2,3};
        System.out.println(area(arr));
        

        
        

       
        
        
        
        

        
         
    }
}
