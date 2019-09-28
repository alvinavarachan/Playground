#include<stdio.h>
#include<string.h>
int main()
{
 char str[20];
  int flag=0;
  scanf ("%s",str);
  int len= strlen(str);
  for (int i=0; i<len; i++)
  {
    if (str[i] != str[len-1-i])
    {
      
      flag=1;
      break;
      
    }
    
  }
  if (flag == 1)
  {
    
    printf ("%s is not a palindrome",str);
  }
  else
  {
        printf ("%s is a palindrome",str);
  }
}