
#include<stdio.h>
int main()
{
    int n,row,col,space;
    scanf("%d", &n);
	int val = 1;
	for(row = 1; row <= n; row++)
	{
        
	    for(space = 1; space <= (n - row); space++){
	        printf(" ");
	    }
        
	    for(col = 1; col <= row; col++)
	    {
	        printf("%d ", val);
	        val++;
	    }
	    printf("\n");
	}
    return 0;
}