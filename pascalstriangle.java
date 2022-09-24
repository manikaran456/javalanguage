import java.util.*;

public class pascalstriangle{
    /**
     * @param args
     */
      public static int fact(int a){

        if(a==1 || a==0)
        return 1;

        else {
          int f=1;
          for(int i=a;i>=2;i--){
            f*=i;
          }
          return f;
        }

        
        
      }
     

     public static void main (String args[]){

      Scanner sc = new Scanner(System.in);
      int a=sc.nextInt();
      for(int i=0;i<a;i++){
        for(int j=0 ; j<a-i;j++){
          System.out.print(" ");
        }
        for(int j=0 ; j<=i ; j++){
          System.out.print((fact(i)/(fact(i-j)*fact(j))) + " ");
        }
        System.out.println();
      }

    }
  }

