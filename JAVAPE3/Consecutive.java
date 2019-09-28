import java.util.*;

public class Consecutive
{
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //System.out.println("enter the number of elemts");
    //int n = sc.nextInt();
    System.out.println("enter the 7 digits");
    String  Number = sc.next();
    String num[] = Number.split(",");
    consecutive(num);
 }
    



public static void consecutive(String num[]) {
     int flag=2;
     int []  num1 = new int[7];
   for(int i=0;i<7;i++)
   {
       num1[i] = Integer.parseInt(num[i]);
       if(i<6)
       System.out.print(num1[i]+",");
       else
       System.out.print(num1[i]);
   }
   for(int j=0;j<7;j++)
   {   
       if(j<6){
       if(num1[j+1]==num1[j]+1 || num1[j+1]==num1[j]-1  )
       {
           flag=1;
       }
       else
       {
           flag=0;
        System.out.print("\t non-consecutive numbers");
        break;
       }
    }
    else
    {
        break;
    }

   }
   if(flag==1)
   {
    System.out.print("\t  are consecutive numbers");
   }




}
}