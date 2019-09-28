import java.util.*;


public class trycat
{
public static void main(String[] args) {
    
 try{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows");
    int  rows1 = sc.nextInt();
     System.out.println("enter the 1st matrix");
     int  matrix1 [] = new int[rows1];
     int[] testScores =new int[0];
     for(int i=0;i<=rows1;i++)
     {
        
            matrix1[i]= sc.nextInt();
    
     }
     int s = testScores.length;
    }

 catch(NegativeArraySizeException e)
 {
     System.out.println("Please enter positive number for rows");
 }
 catch(IndexOutOfBoundsException e)
 {
  System.out.println("array index is out of bound");
 }
 catch(NullPointerException e)
 {
     System.out.println("yes");
 }



}
}