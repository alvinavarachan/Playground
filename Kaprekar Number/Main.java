import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int square=num*num;
        int temp=num;int count=0;
        while(temp!=0)
        {
            temp=temp/10;
            count++;
        }
        int q=(int)(square/Math.pow(10,count));
        int r=(int)(square%Math.pow(10,count));
        if(q+r==num)
            System.out.println("Kaprekar Number");
        else
            System.out.println("Not A Kaprekar Number");
  }
}