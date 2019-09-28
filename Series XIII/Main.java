import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner (System.in);
      int num= sc.nextInt();
      int diff= 11;
      int start =5;
      System.out.printf ("%d",start);
      for (int i=1; i<num;i++)
      {
        int out= start+diff;
        diff= diff+22;
        start=out;
        System.out.printf (" %d",out);
      }
      
	}
}