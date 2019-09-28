import java.util.*;

import javax.lang.model.util.ElementScanner6;

import java.text.SimpleDateFormat;

public class DateTime
{
 public static void main(String[] args) {
     Date thisDate = new Date();
     //System.out.println(thisDate);
     SimpleDateFormat simpleDateformat = new SimpleDateFormat("E dd-MM-yyyy" );
     //System.out.println(simpleDateformat.format(thisDate));
     String day =simpleDateformat.format(thisDate);
     System.out.println(day);
     Calendar c = Calendar.getInstance();
     c.add(Calendar.DAY_OF_MONTH, -1); 
     String newDate = simpleDateformat.format(c.getTime());  
     //System.out.println("Date after Addition: "+newDate);
    if(day.contains("Sun")) 
  {
    SimpleDateFormat firstday = new SimpleDateFormat(" E dd-MM-yyyy ");
    c.add(Calendar.DAY_OF_MONTH, 0); 
    String newDate1 = simpleDateformat.format(c.getTime());  
    System.out.println("First Day of the week: "+newDate1);

    SimpleDateFormat lastday = new SimpleDateFormat("yyyy-MM-dd");
    c.add(Calendar.DAY_OF_MONTH, +6); 
    String newDate2 = simpleDateformat.format(c.getTime());  
    System.out.println("last Day of the week:  "+newDate2);
 }
else  if(day.contains("Mon")) 
{
  SimpleDateFormat firstday = new SimpleDateFormat(" E dd-MM-yyyy ");
  c.add(Calendar.DAY_OF_MONTH, 0); 
  String newDate1 = simpleDateformat.format(c.getTime());  
  System.out.println("First Day of the week: "+newDate1);

  SimpleDateFormat lastday = new SimpleDateFormat("yyyy-MM-dd");
  c.add(Calendar.DAY_OF_MONTH, +6); 
  String newDate2 = simpleDateformat.format(c.getTime());  
  System.out.println("last Day of the week:  "+newDate2);
}
else  if(day.contains("Tue")) 
{
  SimpleDateFormat firstday = new SimpleDateFormat(" E dd-MM-yyyy ");
  c.add(Calendar.DAY_OF_MONTH, 0); 
  String newDate1 = simpleDateformat.format(c.getTime());  
  System.out.println("First Day of the week: "+newDate1);

  SimpleDateFormat lastday = new SimpleDateFormat("yyyy-MM-dd");
  c.add(Calendar.DAY_OF_MONTH, +6); 
  String newDate2 = simpleDateformat.format(c.getTime());  
  System.out.println("last Day of the week:  "+newDate2);
}
else  if(day.contains("Wed")) 
{
  SimpleDateFormat firstday = new SimpleDateFormat(" E dd-MM-yyyy ");
  c.add(Calendar.DAY_OF_MONTH, -1); 
  String newDate1 = simpleDateformat.format(c.getTime());  
  System.out.println("First Day of the week: "+newDate1);

  SimpleDateFormat lastday = new SimpleDateFormat("yyyy-MM-dd");
  c.add(Calendar.DAY_OF_MONTH, +5); 
  String newDate2 = simpleDateformat.format(c.getTime());  
  System.out.println("last Day of the week:  "+newDate2);
}
else  if(day.contains("Thu")) 
{
  SimpleDateFormat firstday = new SimpleDateFormat(" E dd-MM-yyyy ");
  c.add(Calendar.DAY_OF_MONTH, -2); 
  String newDate1 = simpleDateformat.format(c.getTime());  
  System.out.println("First Day of the week: "+newDate1);

  SimpleDateFormat lastday = new SimpleDateFormat("yyyy-MM-dd");
  c.add(Calendar.DAY_OF_MONTH, +4); 
  String newDate2 = simpleDateformat.format(c.getTime());  
  System.out.println("last Day of the week:  "+newDate2);
}
else  if(day.contains("Fri")) 
{
  SimpleDateFormat firstday = new SimpleDateFormat(" E dd-MM-yyyy ");
  c.add(Calendar.DAY_OF_MONTH, -3); 
  String newDate1 = simpleDateformat.format(c.getTime());  
  System.out.println("First Day of the week: "+newDate1);

  SimpleDateFormat lastday = new SimpleDateFormat("yyyy-MM-dd");
  c.add(Calendar.DAY_OF_MONTH, +4); 
  String newDate2 = simpleDateformat.format(c.getTime());  
  System.out.println("last Day of the week:  "+newDate2);
}
else  if(day.contains("Sat")) 
{
  SimpleDateFormat firstday = new SimpleDateFormat(" E dd-MM-yyyy ");
  c.add(Calendar.DAY_OF_MONTH, -4); 
  String newDate1 = simpleDateformat.format(c.getTime());  
  System.out.println("First Day of the week: "+newDate1);

  SimpleDateFormat lastday = new SimpleDateFormat("yyyy-MM-dd");
  c.add(Calendar.DAY_OF_MONTH, 0); 
  String newDate2 = simpleDateformat.format(c.getTime());  
  System.out.println("last Day of the week:  "+newDate2);
}


 } 
}