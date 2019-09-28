#include <stdio.h>
void great(int num,int num1,int num2)
{
   int great;
   if(num>num1)
   {
       great=num;
       if(great>num2)
       {
           printf("%d",great);
       }
       else if(great<num2)
       {
           printf("%d",num1);
       }
   }
   else if (num1>num)
   {
        great=num1;
       if(great>num2)
       {
           printf("%d",great);
       }
       else if(great<num2)
       {
           printf("%d",num1);
       }
   }
}

int main()
{
int n1,n2,n3;
 scanf("%d %d %d",&n1 ,&n2,&n3);
   great(n1,n2,n3);
   return 0;
}