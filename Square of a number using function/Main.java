#include<stdio.h>

int sum(int num)
 {
  int res=0,rem;
  
 
   res= num*num;
 
  
  return res;

 }
int main()
 {
  int n1;
  scanf("%d",&n1);
  int res1 = sum(n1);
  
  
  printf("%d",res1);
}