import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner (System.in);
     
      int age=sc.nextInt();
      float time= sc.nextFloat();
      float price=0;
      
      if (age>13)
      {
        if (time >12.00f && time<16.00f)
        {
          price=5.00f;
        }
        else
        {
           price=8.00f;
        }
        
      }
      else if (age<=13 && age>0)
      {
         if (time >12.00f && time<16.00f)
        {
          price=2.00f;
        }
        else
        {
           price=4.00f;
        }
        
      }
      else
      {
        System.out.println("Not valid");
      }
      System.out.printf("$%.2f",price);
      
	}
}