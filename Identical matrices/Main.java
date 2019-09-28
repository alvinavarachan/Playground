#include <stdio.h>
int main()
{
int row , col, flag=0;
scanf("%d",& row);
scanf("%d",& col);
int mat1[row] [col];
int mat2[row] [col];  
int i, j;
for(i = 0; i < row; i++)
{
  for(j = 0; j < col; j++)
  {
       scanf("%d", & mat1 [i][j]) ;
  }
}
  
  for(i = 0; i < row; i++)
{
  for(j = 0; j < col; j++)
  {
       scanf("%d", & mat2 [i][j]) ;
  }
}
  
  
for (i = 0; i < row; i++)
{
  for (j = 0; j < col; j++)
  {       
     if (mat1 [i] [j] != mat2 [i] [j])
     {
       flag=1;
     }
  }

}
  if (flag==1)
  {
    printf ("No");
  }
  else
  {
     printf ("Yes");
  }
}