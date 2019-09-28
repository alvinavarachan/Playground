import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner (System.in);
      int num= sc.nextInt();
      int count=1;
      for (int r=0; r<num;r++)
      {
        for (int c=0;c<num;c++)
        {
          System.out.printf("%d ",count);
          count++;
          if(r==c)
          {
            break;
          }
        }
        System.out.printf("%n");
        
      }
	}
}