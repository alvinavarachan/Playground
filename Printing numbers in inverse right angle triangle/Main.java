
#include<stdio.h>
int main()
{
    int n,row,col,space;
    scanf("%d", &n);
	int val = n;
  int t=n;
	for(row = 1; row <= n; row++)
	{
        
	    
        
	    for(col = 1; col <=(t); col++)
	    {
	        printf("%d", val);
	        val--;
          
	    }
      t=t-1;
      val=n-row;
	    printf("\n");
	}
    return 0;
}