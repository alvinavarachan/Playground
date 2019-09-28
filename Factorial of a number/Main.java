#include <stdio.h>
int main() {
	int inp,res=1,count;
  scanf ("%d",&inp);
  for (count=1;count<=inp;count++)
  {
    res=res*count;
  }
  printf ("%d",res);
	return 0;
}