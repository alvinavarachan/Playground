import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner (System.in);
      int num= sc.nextInt();
      int len=0;
      int temp=num;
      while(temp!=0)
      {
        temp=temp/10;
        len++;
      }
      if (len==3)
      {
        num=num/10;
        num=num%10;
        if (num%3==0)
        {
           System.out.println("Trendy Number");
        }
        else
        {
          System.out.println("Not a Trendy Number");
        }
      }
       else
        {
          System.out.println("Not a Trendy Number");
        }
     
    }
}