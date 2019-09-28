#include <stdio.h>
int main() 
{
	int in,rem,t,sum=0;
   
  scanf ("%d",&t);
   
    while (t!=0)
    {
      rem=t%10;
      sum=sum+rem;
      t=t/10;
      
    }
  printf("%d",sum);
	return 0;
}