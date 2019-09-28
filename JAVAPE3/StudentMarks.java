import java.util.*;


public class StudentMarks
{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int  numOfStudents = sc.nextInt();
         System.out.println("enter the grades of students");
         int [] stuGrades = new int[numOfStudents];
        try{
         for(int i=0; i<stuGrades.length;i++)
         {
            stuGrades[i] = sc.nextInt();
         }
          for(int i=0;i<stuGrades.length;i++)
        {
        if(stuGrades[i]<0 || stuGrades[i]>100)
        {
            throw new  MyException("error: Grades should be between 0 to 100");
        }
        }
         }
         catch (Exception e){
              
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
