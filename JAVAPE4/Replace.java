import java.util.*;
public class Replace
{
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");
    String str = sc.nextLine();
    String[] wordarray = str.split(""); 
     String word = str.replaceAll("d","f" );
     String word1 =word.replaceAll("l","t");
     System.out.println(word1);
   


    }
}