import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
      int l1= sc.nextInt();
      int l2= sc.nextInt();
      int l3= sc.nextInt();
      int n= sc.nextInt();
      int count=0;
      if(l1>=n)
        count++;
      if(l2>=n)
        count++;
      if(l3>=n)
        count++;
     System.out.println(count);
    }
}