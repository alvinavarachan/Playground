import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
      float cost= sc.nextFloat();
      int sold= sc.nextInt();
     int sell= sold*12;
     // int profit= cost-sell;
      if (sell>cost)
        System.out.printf ("Profit : Rs.%.2f",(sell-cost));
      else if (sell==cost)
        System.out.println ("No profit nor loss");
      else 
        System.out.printf ("Loss : Rs.%.2f",(cost-sell));
    }
}