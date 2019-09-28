#include <stdio.h>
int main()
{
   int a,col,j,row;
  scanf ("%d",&a);
  int t=0;
  for (row=1;row<=a;row++)
  	{
  	for (col=1;col<=row;col++)
  		{
    		if (t==0)
            {
    		printf ("*");
              t=1;
            }
      		else
            {
        	printf ("#");
      		t=0;
            }
      		
         
      
  		}
   			 printf ("\n");
  	}
   
   return 0;
}