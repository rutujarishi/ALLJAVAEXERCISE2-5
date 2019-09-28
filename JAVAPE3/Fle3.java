import java.util.*;
import java.io.*;

public class Fle3
{

        public static void main(String[] args) throws IOException{
            File file1 = new File("FileDemo.txt");
   /* String contents="i am a man ,\ni like to sleep ,\ni have a home.";
    OutputStream outstream = new FileOutputStream(file1);
    outstream.write(contents.getBytes());
    outstream.close();*/
    BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
   // while(reader.hasNext())
  


String firstline = reader.readLine();
String secondline = reader.readLine();
String thirdline = reader.readLine();
reader.close();
int length = firstline.length();
System.out.println(firstline);
System.out.println(secondline);
System.out.println(thirdline);
String word1=  firstline+secondline+thirdline;

int count=0;
        String[] wordsArray = word1.split(" |,");
        for (String word : wordsArray) {
            System.out.println(word);
        }
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : wordsArray) {
            if (map.containsKey(word)) {
                count = map.get(word);
                //System.out.println(count+1);
                map.put(word, count + 1);
            } else {
                map.put(word, 1);
            }
        }
        //10
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        }

}