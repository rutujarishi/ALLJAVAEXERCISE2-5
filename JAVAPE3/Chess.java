import java.util.*;

public class Chess

{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int  rows1 = sc.nextInt();
        System.out.println("Enter the number of columns");
        int  columns1 = sc.nextInt();
         System.out.println("enter the 1st matrix");
       String  matrix1 [][] = new String[rows1][columns1];
        chess(matrix1,rows1,columns1);
    }
    

    public static void chess(String a[][],int rows1,int columns1) {


        for(int i=0;i<rows1;i++)
        {
           for(int j=0;j<columns1;j++)
           {
              if(i%2==0 && j%2==0)
              {
                  a[i][j]="WW|";
                  System.out.print(a[i][j]);
              }
               else if(i%2==0 && j%2!=0)
               {
                a[i][j]="BB|";
                System.out.print(a[i][j]);
               }
               else if(i%2!=0 && j%2==0)
               {
                a[i][j]="BB|";
                System.out.print(a[i][j]);
               }
               else
               {
                a[i][j]="WW|";
                System.out.print(a[i][j]);

               }
           }
           System.out.print("\n"); 

        }

        
    }





}