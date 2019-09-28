#include<stdio.h>
int main()
{ 
  int r;
  int c;
  scanf("%d", &r);
  scanf("%d", &c);
  int matrix1[r][c];
  for(int i = 0; i < r; i++)
  {
   for(int j = 0; j < c; j++)
   {
    scanf("%d", & matrix1[i][j]);
   }
  }
  
  
  int matrix2 [r][c];
  for(int i = 0; i < r; i++)
  {
   for(int j = 0; j < c; j++)
   {
    scanf("%d", & matrix2[i][j]);
   }
  }
  
  
  
  
   
  int result[r][c];
  for(int i = 0; i < r; i++)
  {
   for(int j = 0; j < c; j++)
   {
    result[i][j] = ( matrix1 [i][j]  -  matrix2 [i][j]) ; 
   }
  }
   
  for(int i = 0; i < r; i++)
  {
   for(int j = 0; j < c; j++)
   {
    printf("%d ", result[i][j]);
   }
   printf("\n");
  }
}