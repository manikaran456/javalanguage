import java.util.Scanner;

import javax.print.event.PrintEvent;

import java.io.LineNumberInputStream;
import java.util.*;

public class keepmoving{
    

    public static boolean sudoku(int sudoku[][],int row,int col){
        if(row==9){
            return true;
        }

        int nextrow=row;
        int nextcol=col+1;
        if(nextcol==9){
            nextcol=0;
            nextrow=row+1;
        }
        if(sudoku[row][col] != 0){
            return sudoku(sudoku, nextrow, nextcol);
        }
        for(int dig=1;dig<=9;dig++){
            if(isSafe(sudoku,row,col,dig)){
                sudoku[row][col]=dig;
                if(sudoku(sudoku, nextrow, nextcol)){
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false;
    }
    public static boolean isSafe(int sudoku[][],int row,int col,int dig){
        //rowwise
        for(int i=0;i<=8;i++){
            if(sudoku[row][i]==dig){
                return false;
            }
        }

        //columnwise
        for(int i=0;i<=8;i++){
            if(sudoku[i][col]==dig){
                return false;
            }
        }

        //gridwise
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<=sr+2;i++){
            for(int j=sc;j<=sc+2;j++){
                if(sudoku[i][j]==dig){
                    return false;
                }
            }
        }
        return true;
    }
    public static void print(int sudoku[][]){
        for(int i=0;i<=8;i++){
            for(int j=0;j<=8;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int sudoku[][]={{0,0,8,0,0,0,0,0,0},
       {4,9,0,1,5,7,0,0,2},
       {0,0,3,0,0,4,1,9,0},
    {1,8,5,0,6,0,0,2,0},
    {0,0,0,0,2,0,0,6,0},
    {9,6,0,4,0,5,3,0,0},
    {0,3,0,0,7,2,0,0,4},
    {0,4,9,0,3,0,0,5,7},
    {8,2,7,0,0,9,0,1,3}};

    if(sudoku(sudoku,0,0)){
        System.out.println("Yes");
        print(sudoku);
    }
    else{
        System.out.println("No");
    }
       
       
       
       
       
       
    
       
       
    }
}
