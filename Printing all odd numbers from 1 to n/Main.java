#include <stdio.h>
int main()
{
   int in,count,num;
  scanf ("%d",&in);
  for(count=0;count<=in;count++)
  {
    num=count%2;
      if (num==1)
      {
    printf("%d\n",count);
      }
    
  }
  
   
   return 0;
}