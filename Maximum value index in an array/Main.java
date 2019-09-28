#include<stdio.h>
int main()
{
 int size,t;
 scanf("%d \n", & size);
 int arr[size];
 int max = arr[0];
  
 for(int i = 0; i <= size - 1; i++)
 {
    scanf("%d",&arr[i]);
    
 }
  t= arr[0];
  int i;
  for ( i=1;i < size-1; i++)
  {
      if ( t < arr[i])
      {
        t= arr[i];
       
      }
   
  }
  printf ("%d",i );
    
  
  
  
}

