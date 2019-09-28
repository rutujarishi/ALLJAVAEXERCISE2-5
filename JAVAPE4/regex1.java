import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class regex1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");
    String str = sc.nextLine();
    String regex ="se";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(str);
    while(matcher.find())
    {
        System.out.println("Found at " + matcher.start() + " - "  +matcher.end());
    }

        
    }
}