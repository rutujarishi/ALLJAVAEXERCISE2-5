import java.util.*;
import java.lang.*;


  public  class Keys
{
    public static void main(String[] args) {
        HashMap <String,String> map = new HashMap<String,String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the val1 and val2");
        String word1 = sc.nextLine();
        String[] wordarr = word1.split(" ");
        map.put("val1",wordarr[0]);
        map.put("val2",wordarr[1]);

        for (Map.Entry<String,String> entry : map.entrySet())  
      {
      System.out.println("Key = " + entry.getKey() + 
                       ", Value = " + entry.getValue()); 
      }

      System.out.println(" ");
      String word = map.get("val1");
      map.replace("val1"," ");
      map.replace("val2",word);

      for (Map.Entry<String,String> entry : map.entrySet())  
      {
      System.out.println("Key = " + entry.getKey() + 
                       ", Value = " + entry.getValue()); 
      }
    }
   








    
}