import java.util.*;

public class bintodec{
    /**
     * @param args
     */
      public static int binToDec(int n){

        int dec =0;
        int last = 0;
        int p =0;
        while(n>0){
          last = n%10;
          dec = dec + last*(int)Math.pow(2,p);
          p=p+1;
          n/=10;

        }
        return dec;

        
        
      }
     

     public static void main (String args[]){

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a binary number");
      int a=sc.nextInt();
      int dec = binToDec(a);
      System.out.println("Decimal number :- " + dec);
      
      

    }
  }

