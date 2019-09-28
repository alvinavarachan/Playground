
#include<stdio.h>
 int main()
 {
  int size,c,b;
  scanf("%d \n", &size);
  int arr[size];
  for(int i = 0; i <= size - 1; i++)
   {
    scanf("%d",&arr[i]);
   }
  int search1,search2;
  
  scanf("%d", &search1);
  scanf("%d", &search2);
  
  
  for(int i = 0; i <= size - 1; i++)
   {
     if(search1 == arr[i])
       {
         printf ("%d\n",i);
        b=1;
       }
    
  
   }

       
    
  for(int i = 0; i <= size - 1; i++)
   {
     if(search2 == arr[i])
       {
        printf ("%d",i);
       c=1;
       }  
    
   }
   if (c==0 || b==0)
   {
     printf ("-1");
   }
   

  
  return 0;
 }