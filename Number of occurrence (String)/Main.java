#include <stdio.h>
#include <string.h>
#define SIZE 100
int occurrence(char * str, char * Search);
void upper(char s[]) 
{
  int c = 0;

  while (s[c] != '\0') 
  	{
     if (s[c] >= 'a' && s[c] <= 'z') 
     {
        s[c] = s[c] - 32;
     }
     c++;
  	}
}
int main()
{
   char str[SIZE];
   char Search[SIZE];
   int count;
   scanf("%[^\n]s",str);
   upper(str);
   scanf("%s", Search);
   upper( Search);
   count = occurrence(str, Search);
   printf("%d", count);
   return 0;
}
int occurrence (char * str, char * Search)
{
   int i, j, found, count;
   int stringLen, searchLen;
   stringLen = strlen(str);      
   searchLen = strlen( Search); 
   count = 0;
   for(i=0; i <= stringLen-searchLen; i++)
   {
      
       found = 1;
       for(j=0; j<searchLen; j++)
       {
           if(str[i + j] != Search[j])
           {
               found = 0;
               break;
           }
       }
       if(found == 1)
       {
           count++;
       }
   }
   return count;
}
