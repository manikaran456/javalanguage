import java.util.Scanner;
import java.util.*;

public class keepmoving{

    public static void maxSumSubArrays(int a[]){
        int max=Integer.MIN_VALUE;
        int sum=0;
        int prefix[]=new int[a.length];
        prefix[0]=a[0];
        for(int i=1;i<a.length;i++){
            prefix[i] = prefix[i-1] + a[i];
        }
        
        for(int i=0;i<a.length;i++){
            int start =i;
         for(int j=i;j<a.length;j++){
            int end = j;

            sum = start==0 ? prefix[end] : prefix[end] - prefix[start-1];
            
           if(sum>max)
           max=sum;
          
           }
        System.out.println();
        }

        System.out.println("Max sum of an subarray : "+max);
       
        
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numbers[] = {10,20,30,40,50};
        System.out.print("Original array : ");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        maxSumSubArrays(numbers);
        
    }
}
