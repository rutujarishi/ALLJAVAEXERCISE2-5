import java.util.*;

public class Sort
{
    public static void main(String[] args) {
             
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");
    String str = sc.nextLine();
    String[] wordarray = str.split(" "); 
    
     Arrays.sort(wordarray);
     for(int i=0;i<wordarray.length;i++)
     {
     System.out.println(wordarray[i]);
     }
    }

}