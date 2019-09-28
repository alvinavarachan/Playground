#include <stdio.h>
int main() 
{
	int in,rem,t,sum=0;
   
  scanf ("%d",&t);
   
    while (t>=100)
    {
      
      t=t/10;
      
    }
  t=t%10;
  printf("%d",t);
	return 0;
}