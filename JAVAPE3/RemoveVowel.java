import java.util.*;
import java.lang.*;
class RemoveVowel{
   public static void main(String[] args){
       System.out.println("Enter the place names and Enter end to stop the inputs");
   List<String> myList= new ArrayList<String>();
   Scanner sc= new Scanner(System.in);
   while(sc.hasNext()){
       String temp= sc.nextLine();
       if(temp.equals("end"))
       break;
       myList.add(temp);
   }
   int length= myList.size();
   String[] myString= new String[length];
   for(int i=0;i<length;i++){
       String s =myList.get(i);
       String String1=s.replace('a', ' ');
       String String2=String1.replace('e', ' ');
       String String3=String2.replace('i', ' ');
       String String4=String3.replace('o', ' ');
       String String5=String4.replace('u', ' ');
       String String6=String5.replaceAll("\\s+", "");
       myString[i]=String6;    }
   for(int i=0;i<length;i++){
       System.out.println(myString[i]);    }
}}


