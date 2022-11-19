import java.util.Scanner;
import java.util.*;

public class keepmoving{

    public static void maxSumSubArrays(int a[]){
        int max=Integer.MIN_VALUE;
        int currentsum=0;
        
        
        for(int i=0;i<a.length;i++){
         currentsum = currentsum+a[i];
         if(currentsum<0)
         currentsum=0;

         max=Math.max(max, currentsum);
        }

        System.out.println("Max sum of an subarray : "+max);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numbers[] = {1,-2,8,-5,4,2};
        System.out.print("Original array : ");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        maxSumSubArrays(numbers);
        
    }
}
