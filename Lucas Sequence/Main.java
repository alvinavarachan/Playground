import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc= new Scanner (System.in);
      int inp=sc.nextInt();
      int a=0,b=0,c=1;
      int d;
      System.out.printf("%d %d %d",a ,b ,c);
      for (int i=3;i<inp;i++)
      { 
        d=a+b+c;
        System.out.printf(" %d", d);
        a=b;
        b=c;
        c=d;
        
        
      }
    }
}