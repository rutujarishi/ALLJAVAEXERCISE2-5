import java.util.*;
import java.lang.*;


  public  class Maintest
{
    public static void main(String[] args) {
        Student obj1 = new Student();
        Student obj2 = new Student();
        Student obj3 = new Student();
        Student obj4 = new Student();
        Student obj5 = new Student();
        obj1.setName("Ramesh");   
        obj1.setAge(34);   
        obj1.setId(123);   
        obj2.setName("Suresh");   
        obj2.setAge(34);   
        obj2.setId(124);  
        obj3.setName("Ramesh");   
        obj3.setAge(34);   
        obj3.setId(125);  
        obj4.setName("Mahesh");   
        obj4.setAge(36);   
        obj4.setId(126);  
        obj5.setName("Sudesh");   
        obj5.setAge(37);   
        obj5.setId(127);  
    
        //obj1.getId();
        List<Student> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);
        for(Student b:list){  
          System.out.println("Id:"+b.getId()+" "+"Age:"+b.getAge()+" "+"Name:"+b.getName());  
          
      } 
      Collections.sort(list,new StudentSorter());
      System.out.println("   ");
      for(Student b:list){  
        System.out.println("Id:"+b.getId()+" "+"Age:"+b.getAge()+" "+"Name:"+b.getName());  
        
    } 
       
   }
   
   
} class  StudentSorter implements Comparator<Student>
   {
       @Override
           public int compare(Student Student1, Student Student2) { 
     
               // for comparison 
               int IdCompare = Student1.getId()-(Student2.getId()); 
               int NameCompare = Student1.getName().compareTo(Student2.getName()); 
               int AgeCompare = Student1.getAge()-(Student2.getAge()); 
     
               // 3-level comparison using if-else block 
              if(AgeCompare!=0)
              {
                  return AgeCompare;
              }
              else if(NameCompare!=0)
              {
                  return NameCompare;
              }
              else
              {
                  return IdCompare;
                  
              }
           } 
   
   
   }
      