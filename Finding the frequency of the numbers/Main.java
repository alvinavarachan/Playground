#include<stdio.h>
int main()
{
    
  int i,j, size,k, arr[10];
	scanf("%d", & size);
   	scanf("%d", & k);
  	for(int i = 0; i < size; i++)
  	{
		scanf("%d",& arr[i]);
  	}
 
    for(int i = 0; i < size; i++)
  	{
        for(int j = i+1; j < size; j++)
  		{
			if(arr [i]> arr[j])
			{
    		int temp = arr[j];
    		arr [j]= arr [i];
  			arr [i]= temp;
  			}
  
  		}
  	}	
  		int count =0,f=1;
		for(int num = 1; num <= k; num++ )
 		 {
       		 for(int j = 0; j < size; j++)
       		 {
         	 	if(num == arr [j])
                
          		count = count + 1;
        	 }
         		printf("%d %d\n", num ,count);
  				count =0;
 		 }

    
return 0;
}