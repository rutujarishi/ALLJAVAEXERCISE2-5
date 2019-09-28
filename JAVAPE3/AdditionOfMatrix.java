import java.util.*;


public class AdditionOfMatrix
{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int  rows1 = sc.nextInt();
        System.out.println("Enter the number of columns");
        int  columns1 = sc.nextInt();
         System.out.println("enter the 1st matrix");
         int  matrix1 [][] = new int[rows1][columns1];

         for(int i=0;i<rows1;i++)
         {
            for(int j=0;j<columns1;j++)
            {
                matrix1[i][j] = sc.nextInt();
                
            }

         }
         System.out.println("Enter the number of rows");
         int  rows2 = sc.nextInt();
        System.out.println("Enter the number of columns");
        int  columns2 = sc.nextInt();
        System.out.println("enter the 1st matrix");
         int  matrix2 [][] = new int[rows2][columns2];
         for(int i=0;i<rows2;i++)
         {
            for(int j=0;j<columns2;j++)
            {
                matrix2[i][j] = sc.nextInt();
                
            }

         }
        Addition(matrix1,matrix2,rows1,rows2,columns1,columns2);
    
 }

 public static void Addition(int matrix1[][] , int matrix2[][],int rows1, int rows2,int columns1,int columns2)
    
 {
       if(rows2==rows1 && columns1== columns2 )
       {
        int add[][]= new int[rows1][columns1];

            for(int i=0;i<rows1;i++)
            {
                for(int j=0;j<columns1;j++)
                {
                        add[i][j]= matrix1[i][j]+matrix2[i][j];

                }

            }
            for(int i=0;i<rows2;i++)
            {
                for(int j=0;j<columns2;j++)
                {
                       System.out.print(add[i][j]+"\t"); 

                }

                System.out.print("\n"); 

            }
          

       }
       else
       {
           System.out.println("Please enter matrix of same size");
       }
  
}
 
}