import java.util.*;

public class dectobin{

    public static int decToBin(int n){

        int bin =1;
        int rem=0;
        while(n>0){
            rem=n%2;
            bin=10*bin+rem;
            n/=2;
        }
        int rev=0;

        while(bin>1){
            rem=bin%10;
            rev =rev*10+rem;
            bin/=10;

        }
        return rev;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number ");
        int n =sc.nextInt();
        int bin = decToBin(n);
        System.out.println("Binary number is :- " + bin);

    }
}