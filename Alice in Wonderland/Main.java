import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner (System.in);
      int num= sc.nextInt();
      int sum=0;
      while (num!=0)
      {
        int rem =num%10;
        num=num/10;
        sum=sum+rem;
      }
      System.out.println ("Alice must go in path-"+sum);
	}
}