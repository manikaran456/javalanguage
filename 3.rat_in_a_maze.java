import java.util.*;

public class keepmoving{

    public static boolean reachDes(int maze[][],int x,int y,int sol[][]){
        if(x==maze.length-1 && y==maze.length-1){
            sol[x][y]=1;
            return true;
        }

        if(isSafe(maze,x,y)){
            sol[x][y]=1;
            if(reachDes(maze, x+1, y, sol)){
                return true;
            }
            if(reachDes(maze, x, y+1, sol)){
                return true;
            }
            sol[x][y]=0;
            return false;
        }
        return false;
    }
    
    public static boolean isSafe(int maze[][],int x,int y){
        if(x<maze.length && y<maze.length && maze[x][y]==1){
            return true;
        }
        return false;
    }
    
    public static void print(int sol[][]){
        for(int i=0;i<sol.length;i++){
            for(int j=0;j<sol.length;j++){
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int maze[][]={{ 1, 0, 0, 0 },
                     { 1, 1, 0, 1 },
                     { 0, 1, 0, 0 },
                     { 1, 1, 1, 1 }};
       int n=maze.length;
       int sol[][]=new int[n][n];
       if(reachDes(maze,0,0,sol)){
        System.out.println("Yes");
        print(sol);
       }
       
       
       
       
       
       
    
       
       
    }
}
