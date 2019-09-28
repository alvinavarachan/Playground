#include<stdio.h>
int main()
{
  int a,b;
  scanf("%d",&a);
  b=a%4;
    if (b==0)
    {
      printf ("Leap year\n");
    }
      else 
    printf ("Not Leap year");
  return 0;
}