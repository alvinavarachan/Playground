#include <stdio.h>
int main()
{
int row , col;
scanf("%d",& row);
scanf("%d",& col);
int mat[row] [col];
int i, j, k;
for(i = 0; i < row; i++)
{
  for(j = 0; j < col; j++)
  {
       scanf("%d", & mat [i][j]) ;
  }
}
for (i = 0; i < row; i++)
{
  for (j = 0, k=i ;  k < col; j++ , k++)
  {       
     printf ("%d ", mat[j][k]);
  }
}


}