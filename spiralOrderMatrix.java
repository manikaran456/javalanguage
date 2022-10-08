import java.util.*;

public class spiralOrderMatrix{
    /**
     * @param args
     */
      
     public static void main (String args[]){

      Scanner sc =new Scanner(System.in);
      System.out.println("Enter rows and columns : ");
      int r = sc.nextInt();
      int c = sc.nextInt();
      int num[][] = new int[r][c];
      for(int i=0;i<r;i++){
        System.out.println("Enter values in row "+(i+1));
        for(int j=0;j<c;j++){
          num[i][j]=sc.nextInt();
        }
      }
      System.out.println();
      System.out.println("Matrix : ");
      
      for(int i=0;i<r;i++){
        
        for(int j=0;j<c;j++){
         System.out.print(num[i][j]+" ");
        }
        System.out.println();
      }
      int rstart=0;
      int rend=r-1;
      int cstart=0;
      int cend=c-1;
      System.out.println();
      System.out.println("Spiral order matrix : ");
      while(rstart<=rend && cstart<=cend){
        //1
        for(int i=cstart;i<=cend;i++){
          System.out.print(num[rstart][i]+" ");
        }
        rstart++;
        //2
        for(int i=rstart;i<=rend;i++){
          System.out.print(num[i][cend]+" ");
        }
        cend--;
        //3
        for(int i= cend;i>=cstart;i--){
          System.out.print(num[rend][i]+" ");
        }
        rend--;
        //4
        for(int i = rend;i>=rstart;i--){
          System.out.print(num[i][cstart]+" ");
        }
        cstart++;

      }

      
       
        
      
    }
  }

