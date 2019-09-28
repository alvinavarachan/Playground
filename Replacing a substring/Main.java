#include <stdio.h>
#include <string.h>
#include<stdlib.h>
int main()
{
 char str[100], rep[10], new[10], temp[10][10];
 int i=0, j=0, k=0, c, len;
     scanf("%[^\n]s",str);
     scanf("%s",rep);
     scanf("%s",new);
     len=strlen(str);
  while(i < len)
     {
       if (str[i]!=' ')
       {
         temp [k] [j] = str[i];
         j++;
       }
       else
       {
         temp [k] [j]= '\0' ;
         j=0; k++;
       }
       i++;
     }
 temp [k] [j]= '\0' ;
 c=k;
 for (i=0; i<=c; i++)
 {
   if (strcmp (temp[i],rep) == 0)
     strcpy ( temp[i], new);
   	 printf("%s ", temp[i]);
 }
 return 0;
}