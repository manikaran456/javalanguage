import java.util.Scanner;
import java.util.*;

public class keepmoving{
    
    public static boolean anagrams(String s1,String s2){
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        if(s1.length() == s2.length()){
            char a[] = s1.toCharArray();
            char b[] = s2.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            boolean result = Arrays.equals(a, b);
            if(result)
            return true;

            else
            return false;
        }
        else
        return false;
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       
       String s1="care";
       String s2="race";
       
       

       System.out.println(anagrams(s1, s2));
       
       
       
       
       
       
       
        
        

        
        
        
        
       
    }
}

