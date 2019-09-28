import java.util.*;

public class RepitionChar
{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");
    String word = sc.nextLine();
    System.out.println("Enter the string");
    char ch = sc.next().charAt(0);
    String w = Character.toString(ch);
    String[] wordarray = word.split(w);    for(int i=0;i<wordarray.length;i++)
    {
        System.out.println(wordarray[i]);
    }
    int length = wordarray.length;
    if(word.charAt(length)==ch)
    {
   
    System.out.println(length);
    }
    else
    {
    
    System.out.println(length-1);
    }
  
    

}


}