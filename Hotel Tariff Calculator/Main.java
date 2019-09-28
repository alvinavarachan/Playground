import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner (System.in);
      int month= sc.nextInt();
      int rent= sc.nextInt();
      int stay= sc.nextInt();
      float amount;
      if (month<=12 && month>0)
      {
      switch (month)
      {
        case 4:
        case 5:
        case 6:
        case 11:
        case 12: 
          amount= (float)(stay*(rent+(rent*20/100)));
          break;
        default:
          amount= (float) (stay*rent);
          break;
      }
      System.out.printf ("%.2f",amount);
      }
      else
      {
        System.out.printf ("Invalid Input");
      }
          
      }
      
	
}