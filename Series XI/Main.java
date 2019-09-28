import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner (System.in);
      int num= sc.nextInt();
      float diff= 20.5f;
      float start =95.0f;
      System.out.printf ("%.1f",start);
      for (int i=1; i<num;i++)
      {
        float out= start+diff;
        diff= diff+2.0f;
        start=out;
        System.out.printf (" %.1f",out);
      }
      
	}
}