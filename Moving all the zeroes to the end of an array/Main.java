#include <stdio.h>

int main() {
    
    int i, count=0;
   
   int size;
   scanf("%d",& size);
   int arr[size];
       for(int i = 0; i <= size - 1; i++)
       {
           scanf("%d", & arr[i]);
       }
     
   for(i = 0; i < size; i++) 
   {
       
       if(arr[i] > 0)
       {
         
         arr[count] = arr[i];
      count++;
       }
       
   }
   
   while(count < size)
   {
    
       arr[count] = 0;
     count++;
   }
   
   
    
   for(i = 0; i < size; i++) 
   {
       printf("%d ",arr[i]);
   } 
   return 0;
}