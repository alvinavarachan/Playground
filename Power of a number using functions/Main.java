#include<stdio.h>
int power(ba,exp)
{
  int res=1;
  for (int i=1;i<=exp;i++)
  {
    res=res*ba;
  }
  printf ("%d",res);
}

int main()
{
    int b,e;
  scanf ("%d%d",&b,&e);
  power (b,e);
  	return 0;
}