import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class regex{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");
    String str = sc.nextLine();
    String regex = "[0-9]+";
    boolean matches = Pattern.matches(regex, str);
    if(matches==true)
    {
        System.out.println("yes");
    }

System.out.println("Is Harry here ?" + matches);

}

}