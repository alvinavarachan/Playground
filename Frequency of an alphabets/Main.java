#include <stdio.h>
#include <string.h>
int main()
{
char s[100],gh[100];
int n,i,k,j;
scanf("%[^\n]s",s);
n=strlen(s);

for (int i = 0; i < n; ++i) 
      {

          for (int j = i + 1; j < n; ++j)
          {

              if (s[i] > s[j]) 
              {

                 int a =  s[i];
                  s[i] = s[j];
                  s[j] = a;

              }

          }
      }
      for (int i = 0; i < n; i++) 
      {
int f=1,c=1;

          for (int j = i+1; j < n; j++)
          {

              if (s[i] == s[j]) 
              {
              f=f+1;
              c=0;
              }
              if(c==0)
          {
              s[j]='0';
              c=1;
          }
            
              
          }
          if( (s[i]>='a' && s[i]<='z') || (s[i]>='A' && s[i]<='Z'))
             printf("%c%d ",s[i],f); 
             
      }
      
 return 0;
}