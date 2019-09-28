#include<stdio.h>
int main()
{
 int size,t,sum1=0,sum2=0;
 scanf("%d \n", & size);
 int arr[size];
 int max = arr[0];
  
 for(int i = 0; i <= size - 1; i++)
 {
    scanf("%d",&arr[i]);
    
 }
  
  for (int i=0;i<size/2; i++)
  {
      sum1= sum1 + arr[i];
  }
  
  
  for (int i=size/2;i<size; i++)
  {
      sum2= sum2 + arr[i];
  }
  
  if (sum1==sum2)
  {
    printf ("Perfect Batch");
  }
  else
  {
    printf ("Not a Perfect Batch");
  }
}

