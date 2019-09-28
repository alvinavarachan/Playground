import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner sc= new Scanner (System.in);
  int tot=sc.nextInt();
  int rem = sc.nextInt();
  
  System.out.println ("The number of students in each team is "+ tot/rem+" and left out is "+tot%rem);
}
}