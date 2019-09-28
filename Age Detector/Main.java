import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
      int birth=sc.nextInt();
      int current= sc.nextInt();
      if (current<birth)
      {
        current= current+100;
      }
      System.out.println(current-birth);
    }
}