import java.util.*;
import java.lang.*;


  public  class Set
{

public static void main(String[] args) {
    HashSet<String> set = new HashSet<String>(); 
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of set");
        String word1 = sc.nextLine();
        String[] wordarr = word1.split(" ");
        for(String s:wordarr)
        {
        set.add(s);
        }
     
        for(String s:wordarr)
        {
        System.out.print(s+" ");
        }
        System.out.println("\n");
        System.out.println("Sorted Set ");
        SortedSet<String> sites = new TreeSet<>(set); 
        for(String s:sites)
        {
        System.out.print(s+" ");
        }
        System.out.println("\n");
/*for(int i=0;i<set.size();i++)
{
   
    int NameCompare = set.get(i).compareTo(set.get(i+1)); 
      if(NameCompare <0)
      {
          temp=set.get(i+1);
          set.get(i+1)= set.get(i);

      }
  
}*/
       System.out.println("ArrayList from Set");
        List<String> list = new ArrayList<String>(set); 
        Collections.sort(list); 
        for(String s:list)
        {
        System.out.print(s+" ");
        }
        
}

    
}