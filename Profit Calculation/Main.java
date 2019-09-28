import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner (System.in);
      int x=sc.nextInt();
      int a=sc.nextInt();
      int b= sc.nextInt();
      int total = x*a;
      int spend= x*b;
      int agency=100;
      int profit= (total-spend-100);
      System.out.println ("The profit obtained is Rs."+profit);
      
       
	}
}