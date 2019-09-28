import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner (System.in);
      int row= sc.nextInt();
      int col= sc.nextInt();
      int num= sc.nextInt();
      int len= row*col;
      if (num<=len)
      {
      if ((num%row==1) ||(num%row==0))
      {
        System.out.println ("Yes");
      }
      else
      {
         System.out.println ("No");
      }
      }
	}
}