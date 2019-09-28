#include<stdio.h>
int main()
{
   int num1,c=0,d=0,e=0;
  scanf("%d",&num1);
  c=num1/100;
  d=num1%10;
  e=c+d;
  printf("%d",e);
  return 0;
}