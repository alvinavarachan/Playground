#include<stdio.h>
int main()
{
int n;
scanf("%d", &n);
for(int row = 1; row <= n; row++)
{
       
   for(int col = 1; col <= n; col++)
   {
           
         if ((row%n==1) || (col == n)|| (row%n==0) ||(col == 1)){
             printf ("*");
       
       }
       else{
           printf(" ");
       }
   }
   printf("\n");
}
   return 0;
}