
#include<stdio.h>
int main()
{
    int size;
    scanf("%d", & size);
    int arr[size];
    for(int i = 0; i < size; i++)
    {
       scanf("%d", & arr[i]);
    }
    
    for (int i=0; i< size; i++)
    {
      
      for (int j=i+1; j< size ; j++)
      {
          
        if (arr[i] <= arr[j])
        { 
          if (arr[j]>arr[j-1])
          {
          
            printf ("%d,%d \n", arr[i], arr[j]);
          }
        }
        
      }
      
      
    }
    
 
}