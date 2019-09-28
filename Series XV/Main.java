import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner (System.in);
      int num= sc.nextInt();
      int diff1= 5;
      int diff2=diff1;
      int start =3;
      int out=0;
      System.out.printf ("%d",start);
      out=start+diff1;
      System.out.printf (" %d",out);
      out=out+diff2;
      System.out.printf (" %d",out);
       
      for (int i=3; i<num;i++)
      {
		 int diff=diff1+diff2+1;
        out= out+diff;
        System.out.printf (" %d",out);
        diff2=diff1;
        diff1=diff;
        
        
        
      }
      
	}
}