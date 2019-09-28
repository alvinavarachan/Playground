#include<stdio.h>

void ro_le(int dig[],int size,int iter);


int main() {
   int size,dig[10],i,iter;
   
   scanf("%d",&size);
   
   
   for( i = 0; i < size ; i++)
   {
       scanf("%d",&dig[i]);
   }
   
   
   scanf("%d",&iter);
  
   ro_le(dig,size,iter);
  
   return 0;  
}

 void ro_le(int dig[],int size,int iter)
 {
     int i , j ;
     int odd_temp,even_temp,odd_temp_idx,even_temp_idx;
     odd_temp_idx = (size%2 == 0)? size -2:size-1;
     even_temp_idx =(size%2 == 0)? size - 1: size-2 ;
     

    
    
    for( i = 0 ; i < iter ; i++)
    {
        
        
        odd_temp = dig[odd_temp_idx];
        for( j = odd_temp_idx; j >= 0 ; j=j-2)
        {
            
            dig[j]=dig[j-2];
        }
        
        dig[0] = odd_temp;
        
      
        
        even_temp = dig[1];
        
        for( j = 1; j < size ; j = j+2)
        {
            
           dig[j] = dig[j+2]; 
        }
        
        dig[even_temp_idx] = even_temp;
        
    }
    
    for( i = 0 ; i < size ; i++ )
    {
        printf( "%d ", dig[i]);
    }
  
 }