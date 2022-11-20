import java.util.Scanner;
import java.util.*;

public class keepmoving{

    public static int buySellStocks(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){

            if(buyprice<prices[i]){
                int profit = prices[i]-buyprice;
                maxProfit = Math.max(maxProfit,profit);
            }
            else{
                buyprice=prices[i];
            }
        }
        
        return maxProfit;
        
    }
    
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int prices[] = {7,2,5,3,6,4,1,10};
       System.out.println(buySellStocks(prices));
       
    }
}
