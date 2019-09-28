#include<stdio.h>
int main()
{
    int size;
    scanf("%d", & size);
    int arr[size],c=0,l=0;
    for(int index = 0; index < size; index++)
    {
        scanf("%d", &arr[index]);
    }
   for(int index = 0; index < size; index++)
    {
     if(arr[index]==1)
     {
       c++;
     }
  else
  {
    c=0;
  }
     if(l<c)
       l=c;
   }
     printf("%d ",l);
   return 0;
}
