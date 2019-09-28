import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner (System.in);
      int num= sc.nextInt();
      int diff= 2;
      int start =9;
      System.out.printf ("%d",start);
      for (int i=1; i<num;i++)
      {
        int out= start+diff;
        diff= start;
        start=out;
        System.out.printf (" %d",out);
      }
      
	}
}