import java.util.*;

public class dectobin{

    public static int decToBin(int n){

        int bin =0;
        int p=0;
        int rem=0;
        while(n>0){
            rem=n%2;
            bin=bin+rem*(int)Math.pow(10,p);
            p++;
            n/=2;
        }
        return bin;

       
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number ");
        int n =sc.nextInt();
        int bin = decToBin(n);
        System.out.println("Binary number is :- " + bin);

    }
}