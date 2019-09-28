import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner Sc= new Scanner (System.in);
      int l1= Sc.nextInt();
      int l2= Sc.nextInt();
      int l3= Sc.nextInt();
      String l4= Sc.nextLine();
     int min,max,med;
      
      
      
      
      
      if ((l1<l2 &&l1>l3)||(l1>l2 &&l1<l3))
      {
        System.out.println ("L1");
      }
      if ((l2<l1 &&l2>l3)||(l2>l1 &&l2<l3))
      {
        System.out.println ("L2");
      }
      if ((l3<l2 &&l3>l1)||(l3>l2 &&l3<l1))
      {
        System.out.println ("L3");
      }
     
      
    }
}