import java.util.*;
import java.io.*;

public class Fle

{
    public static void main(String[] args) throws IOException{
        File file1 = new File("Flowers.text");
/*String contents="A flower is a special part of the plant. Flowers are also called the bloom or blossom of a plant. Flowers have petals. Inside the part of the flower that has petals are the parts which produce pollen and seeds.";
OutputStream outstream = new FileOutputStream(file1);
outstream.write(contents.getBytes());
outstream.close();*/

BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
String firstline = reader.readLine();
reader.close();
String secondline =firstline.toUpperCase();
int length = firstline.length();
System.out.println(secondline);
System.out.println("Length of the file is  "+length);



    }



}