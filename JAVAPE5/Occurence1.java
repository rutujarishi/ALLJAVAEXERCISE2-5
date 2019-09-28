import java.util.*;
import java.lang.*;

public class Occurence1
{
    public static void main(String[] args) {
    HashMap <String,Boolean> map = new HashMap<String,Boolean>();
        Scanner sc = new Scanner(System.in);
        //System.out.println("enter the  no of elements");
       //int n = sc.nextInt();
        System.out.println("enter the elements");
        String words = sc.nextLine();
        String[] wordarr= words.split(" ");
        boolean count=true;
        for(String s :wordarr)
        {
                if(map.containsKey(s))
                {
                   count = map.get(s);
                    map.put(s,true);
                   
                }
                else
                {
                    map.put(s,false);                    

                }
              

        }
      // using for-each loop for iteration over Map.entrySet() 
      for (Map.Entry<String,Boolean> entry : map.entrySet())  
      {
      System.out.println("Key = " + entry.getKey() + 
                       ", Value = " + entry.getValue()); 
      }


    }
}