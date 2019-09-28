import java.util.*;
import java.lang.*;

public class Occurence
{
    public static void main(String[] args) {
    HashMap <String,Integer> map = new HashMap<String,Integer>();
        Scanner sc = new Scanner(System.in);
        //System.out.println("enter the  no of elements");
       //int n = sc.nextInt();
        System.out.println("enter the elements");
        String words = sc.nextLine();
        String[] wordarr= words.split(" ");
        int count=0;
        for(String s :wordarr)
        {
                if(map.containsKey(s))
                {
                   count = map.get(s);
                    map.put(s,count+1);
                   
                }
                else
                {
                    map.put(s,1);                    

                }
              

        }
      // using for-each loop for iteration over Map.entrySet() 
      for (Map.Entry<String,Integer> entry : map.entrySet())  
      {
      System.out.println("Key = " + entry.getKey() + 
                       ", Value = " + entry.getValue()); 
      }


    }
}