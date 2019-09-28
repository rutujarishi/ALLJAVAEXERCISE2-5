import java.util.*;
import java.io.*;

public class Fle1
{
     public static void main(String[] args) throws IOException {

        File file = new File("/home/cgi/Desktop/JAVAPE3");
        String [] files = file.list();
        //ArrayList<String> alfiles=new ArrayList<String>();
       // for(File f: files)alfiles.add(f);
       /* for(int i=0;i<files.length;i++)
        {
                System.out.println(files[i]);
        }*/
        int n = files.length;
        String FileName=" ";
        for(int j=0;j<n;j++)
        {
            
            if(files[j].lastIndexOf(".") != -1 && files[j].lastIndexOf(".") != 0)
          FileName = files[j].substring(files[j].lastIndexOf(".")+1);
            if(FileName.equals("text"))
            {

                System.out.println(files[j]);
                    BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(files[j])));
                    String firstline = reader.readLine();
                    reader.close();
                    String secondline =firstline.toUpperCase();
                    int length = firstline.length();
                    System.out.println(secondline);
            }
         
        }
       
     }
   

}