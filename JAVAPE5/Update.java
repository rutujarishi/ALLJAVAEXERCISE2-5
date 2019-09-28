import java.util.*;
import java.lang.*;

public class Update
{
    public static void main(String[] args) {
    List<String> fruits = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //System.out.println("enter the  no of elements");
       //int n = sc.nextInt();
        System.out.println("enter the elements");
        String words = sc.nextLine();
        String[] wordarr= words.split(" ");
        fruits = Arrays.asList(wordarr); 
        System.out.println("enter the element ypu want to update");
        String word = sc.nextLine();
        System.out.println(fruits);
        int temp = fruits.indexOf(word);
        //System.out.println(temp);
        fruits.set(temp, "grapes");
        System.out.println("My list after update"+fruits);
        List<String> fruit = new ArrayList<>();
        fruits.removeAll(fruits);
        System.out.println("MY LIST AFTER REMOVING");
        System.out.println(fruit);


    }
}