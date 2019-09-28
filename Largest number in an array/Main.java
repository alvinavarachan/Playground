
#include<stdio.h>
 int main()
 {
  int size,temp;
  scanf("%d \n", &size);
  int arr[size];
  for(int i = 0; i <= size - 1; i++)
   {
    scanf("%d",&arr[i]);
   }
  
 temp=arr[0];
  
  for(int i = 1; i <= size - 1; i++)
   {
     if(temp <= arr[i])
       {
         temp=arr[i];
       }
    
   }
   printf ("%d",temp);

       
    
  
  
  return 0;
 }