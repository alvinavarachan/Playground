#include <stdio.h>
int main() 
{
	int in,rem,t,n,sum=0;
   
  scanf ("%d",&t);
   n=t%10;
    while (t>=10)
    {

      t=t/10;
      
    }
  
  sum=n+t;
  printf("%d",sum);
	return 0;
}