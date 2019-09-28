import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner (System.in);
      int item= sc.nextInt();
      float time= sc.nextFloat();
      float total=0f;
      switch (item)
      {
        case 1: total =time;
           System.out.printf ("%.2f",total);
          break;
        case 2: total = time*1.5f;
           System.out.printf ("%.2f",total);
          break;
        case 3: total = time*2.0f;
           System.out.printf ("%.2f",total);
          break;
        default: 
          System.out.println ("Number of items is more");
          break;
      }
     
      
	}
}