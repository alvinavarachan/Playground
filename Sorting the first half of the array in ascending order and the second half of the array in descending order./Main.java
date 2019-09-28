#include<stdio.h>
int main()
{
   int size;
   scanf("%d", & size);
   int arr[size];
   for(int i = 0;i < size; i++)
   {
      scanf("%d", & arr[i]);  
   }
   
  
   for (int i = 1; i < (size/2); i++) 
   {
     int temp = arr[i];
     int j = i - 1;
     while((j >= 0) && (arr[j] > temp)) 
     {
       arr[j + 1] = arr[j];
       j--;
     }
     arr[j + 1] = temp;
   }
   
   
   
for (int i = (size/2); i < size; i++) 
   {
     int temp = arr[i];
     int j = i - 1;
     while((j >= (size/2)) && (arr[j] < temp)) 
     {
       arr[j + 1] = arr[j];
       j--;
     }
     arr[j + 1] = temp;
   }
   
   
   for(int i = 0; i < size; i++)
   {
     printf("%d ", arr[i]);
   }
}