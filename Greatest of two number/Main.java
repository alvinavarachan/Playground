#include<stdio.h>
int main()
{
  int num1,num2,c=0;
  scanf("%d%d",&num1,&num2);
  
  if (num1>num2)
  {
    printf("num1 is the greatest"); 
  }
  if (num1<num2)
  {
    printf("num2 is the greatest"); 
  }
 
   if (num1==num2)
  {
    printf("Both number are equal"); 
  }
  
  return 0;
}