import java.util.*;

public class trcat

{
  public static void main(String[] args) 
  {

    
      try {
          throw new MyException("error");
      } catch (Exception e) {
          System.out.println(e);
      }
    
  }



  public static class MyException extends Exception
    {

        public MyException(String msg)
        {
                super(msg);
        }
    }




}
