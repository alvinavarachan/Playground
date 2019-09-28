#include<stdio.h>

int sum(int num)
 {
  int res=0,count,rem;
  
  for (count=1;count<=num;count++)
  {
   
     res=res+count;
    
  }
  
  return res;
 
    
 }
int main()
 {
  int n1;
  scanf("%d",&n1);
  int res1 = sum(n1);
  
  
  printf("%d \n",res1);
}