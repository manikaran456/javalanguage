import java.util.Scanner;
import java.util.*;

public class keepmoving{

    public static void reverse(int a[]){
        int i=0,j=a.length-1;
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numbers[] = {10,20,30,40,45,66,79};
        System.out.print("Original array : ");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        reverse(numbers);
        System.out.println("Rversed Array : ");
        for(int i=0;i<numbers.length;i++){              // Arrays are passed as refernce so original array is reversed 
            System.out.print(numbers[i]+" ");           //and we can ouput the array in main fn it will be reversed 
        }   
    }
}
