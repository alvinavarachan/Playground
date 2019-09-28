import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner (System.in);
      int inp= sc.nextInt();
      int out=0;
      
      int n1=0,n2=1,n3=0,i;
      if (inp==1)
      { System.out.println (n1);
      }
      else if (inp==2)
      {
      System.out.println (n2);
      }
        
   else{ 
 for(i=2;i<inp;++i)
 {    
  n3=n1+n2;      
  n1=n2;    
  n2=n3;    
 }    
 System.out.println (n3);
         
      
   }
      
	}
}