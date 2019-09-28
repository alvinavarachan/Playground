#include <stdio.h>

int main() 
{
    
    int i, out,sum=0;
   
   int size,search;
   scanf("%d",& size);
  
   int arr[size];
       for(int i = 0; i <= size - 1; i++)
       {
           scanf("%d", & arr[i]);
       }
  scanf("%d",& out);
     for(int i = 0; i <=size-1; i++)
       {
        	for(int j = i+1; j <=size-1; j++)
       		{
              sum=arr[i]+arr[j];
               if (sum==out)
               {
                   printf ("Perfect couple:");
                     printf (" %d %d", arr[i], arr[j]);
                  i=size;
                     j=size;
               }
        
     		}
     	}
  		if (sum !=out)
 		 {
  		printf ("No perfect couple found!");
  		}
   
}