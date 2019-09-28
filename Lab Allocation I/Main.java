import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner Sc= new Scanner (System.in);
      int x= Sc.nextInt();
      int y= Sc.nextInt();
      int z= Sc.nextInt();
     
      if(x < y && x < z)
        {
            System.out.println("L1");
        }
        else if(y < z)
        {
            System.out.println("L2");
        }
        else
        {
            System.out.println("L3");
        }
     
      
    }
}