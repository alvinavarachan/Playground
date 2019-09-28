import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner (System.in);
      int inp= sc.nextInt();
     int out=1;
      int i=1,flag=0;
        
      while(i!=0)
      {
        out= out*i;
        i++;
        if (out== inp)
        {
          flag=1;
          break;
        }
            
      }
     if( flag==1)
     {
     System.out.println ("Yes");
     }
      else
      {
        System.out.println ("No");
      }
   
   
      
	}
}