import java.util.Scanner;
import java.util.*;

public class keepmoving{

    public static int trappingRainwater(int height[]){
        int lmax[]=new int[height.length];
       int rmax[]=new int[height.length];
       int trappedwater=0;
       lmax[0]=height[0];
       rmax[height.length-1]=height[height.length-1];

       for(int i=1;i<height.length;i++){
       
        lmax[i]=Math.max(lmax[i-1],height[i]);
        
       }
       for(int i=height.length-2;i>=0;i--){
        rmax[i]=Math.max(rmax[i+1], height[i]);
       }

       for(int i=0;i<height.length;i++){
        
        int waterlevel=Math.min(lmax[i], rmax[i]);
        trappedwater += waterlevel-height[i];
      
       }    
       return trappedwater;
        
    }
    
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int height[] = {4,2,0,6,3,2,5};
       System.out.println("Trapped water is : "+trappingRainwater(height));
          
    }
}
