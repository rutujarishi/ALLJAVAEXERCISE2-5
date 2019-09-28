import java.util.*;

public class Transpose
{

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");
    String str = sc.nextLine();
    String[] wordarray = str.split(" "); 
    String[] wordarray1 = new String[wordarray.length] ;

    for(int i=0;i<wordarray.length;i++)
    { 
        StringBuffer sb = new StringBuffer();
        sb.append(wordarray[i]);
        sb=  sb.reverse();
        wordarray1[i]= sb.toString();
    }

    for(int i=0;i<wordarray.length;i++)
    {
    System.out.print(wordarray1[i]+" ");
    }


    }
}