#include<stdio.h>
int main()
{
    
  int size, k ,arr[10];
scanf("%d", &size);
  for(int i = 0; i < size; i++)
  {
scanf("%d",&arr[i]);
  }
  scanf("%d", &k);
 
    for(int i = 0; i < size; i++)
  {
        for(int j = i+1; j < size; j++)
  		{
			if(arr[i]>arr[j])
				{
    			int l=arr[j];
    			arr[j]=arr[i];
  				arr[i]=l;
  				}
  
 		 }
  }
  
  printf("%d",arr[size-k]);

return 0;
}
