import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc= new Scanner (System.in);
      int sun = sc.nextInt();
      int mon = sc.nextInt();
      int tue = sc.nextInt();
      int wed = sc.nextInt();
      int thu = sc.nextInt();
      int fri = sc.nextInt();
      int sat = sc.nextInt();
      int hour=0;
      int salary=0;
      int bonus=0;
      hour = mon+tue+wed+thu+fri;
      salary= salary+(mon*100);
      if (mon>8)
      {
        salary=salary+((mon-8)*15);
      }
      salary= salary+(tue*100);
      if (tue>8)
      {
        salary=salary+((tue-8)*15);
      }
      salary= salary+(wed*100);
      if (wed>8)
      {
        salary=salary+((wed-8)*15);
      }
      salary= salary+(thu*100);
      if (thu>8)
      {
        salary=salary+((thu-8)*15);
      }
      salary= salary+(fri*100);
      if (fri>8)
      {
        salary=salary+((fri-8)*15);
      }
      
     
      if (hour>=40)
      {
        bonus=bonus+ ((hour-40)*25);
      }
      float sunsa= (sun*100);
      sunsa= sunsa+ (sunsa*.5f);
       
     float satsa= (sat*100);
     satsa=satsa+ (satsa*.25f);
      
    float total=salary+sunsa+bonus+satsa; 
      System.out.printf ("%.2f",total);
    }
}