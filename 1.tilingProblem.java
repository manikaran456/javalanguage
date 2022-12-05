import java.util.Scanner;
import java.util.*;

public class keepmoving{

    public static int totalWays(int n){
        if(n==0 || n==1){
            return 1;
        }

        //kaam
        //vertical
        int fnm1 = totalWays(n-1);

        //horizontal
        int fnm2 = totalWays(n-2);

        int total = fnm1 + fnm2;
        return total;
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       System.out.println(totalWays(n));

       
       
       
    }
}

