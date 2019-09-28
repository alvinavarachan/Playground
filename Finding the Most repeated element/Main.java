#include<stdio.h>
int main()
{
    
  int i,j,size,k,arr[10],temp;
scanf("%d", & size);

  for(int i = 0; i < size; i++)
  {
scanf("%d",&arr[i]);
  }
  int c=0,f=0;
for(int i = 0; i < size;i++ )

  {
  c=0;
        for(int j = 0; j < size; j++)
        {
          if(arr[i]==arr[j])
          c=c+1;
        }
       if(f<c)
       {
         f=c;
         temp=arr[i];
       }
  }
  
   
        printf("%d ",temp);
  
    
return 0;
}

