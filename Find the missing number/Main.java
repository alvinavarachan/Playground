#include <stdio.h>
int main()
{
  int size,i,j,n,out,flag=0;
    scanf ("%d", & size);
  int arr [size];
  
   for (int k=0 ; k< size; k++)
   {
		 scanf ("%d",& arr [k]);
   }
  
   for ( i=0 ; i<size; i++)
   {
     for ( n=1+i; n<= size; n++)
     {
        if (arr [i]!= n)
        {
         out = n;
          flag=1;
        }
       
         break;
      
     }
     if (flag==1)
     {
       printf ("%d", out);
       break;
     }
       
   }
   
  
   
   return 0;
}