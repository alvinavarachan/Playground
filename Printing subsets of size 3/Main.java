#include <stdio.h>

int main() 
{
    
    int i;
   
   int size;
   scanf("%d",& size);
 
   int arr[size];
       for(int i = 0; i <= size - 1; i++)
       {
           scanf("%d", & arr[i]);
       }
     for(int i = 0; i <size-1; i++)
       {
       
        	for(int j = i+1; j <=size-1; j++)
       		{
              	for(int k = j+1; k <=size-1; k++)
       			{
        		printf ("(%d, %d, %d)",arr[i],arr[j],arr[k]);
                  printf(" ");
                }
        	}
       printf ("\n");
       
        }
     	

   
}