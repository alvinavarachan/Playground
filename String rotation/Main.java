#include<stdio.h>
#include<string.h>
void main()
{  
 int i;
 char str[20],str1[20];
 scanf("%s",str);
  scanf("%s",str1);
 char temp[20];
 int len = strlen(str);
 int rot=1,c=0;
while(rot!=len)
{

 for(int index = 0; index < len; index++)
 {
   i = (index + rot) % len;
   temp[i] = str[index];
 }
 if(strcmp(temp,str1)==0)
 {
     c=1;
     break;
 }
 
 rot++;
  
}
if(c==1)
 printf("Yes");
 else
  printf("No");
}