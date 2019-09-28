#include <stdio.h>
void power(int num)
{
   int ans,count=0;

   for(int j=2;j<=num;j++)
   {
        count=0;
       for(int i=1;i<=j;i++)
       {
           if(j%i==0)
           {
             
             count=count+1;
           }
       }
     if(count<3)
     {
        printf("%d \n",j);
    
   }
   

}
}
int main()
{
int l;
 scanf("%d",&l);
   power(l);
   return 0;
}