import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner (System.in);
      int num= sc.nextInt();
      int f=2;
      System.out.printf("%d",f);
      for (int i= 1; i<num; i++)
      {
        
        int out= (f*f)-1;
          f=out;
        System.out.printf(" %d",out);
      }
	}
}