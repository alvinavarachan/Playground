import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner (System.in);
     float speed= sc.nextFloat();
      float distance= sc.nextFloat();
      float time= sc.nextFloat();
      float cardist;
      cardist= speed*(1/3600f)*time;
      if (cardist>distance)
      {
      System.out.printf ("Yes");
      }
      else
      {
         System.out.printf ("No");
      }
          
      }
      
	
}