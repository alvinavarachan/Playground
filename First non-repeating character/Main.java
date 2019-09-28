#include<stdio.h>
#include<string.h>
int main()
{
    char inp[100];
    int i,j;
  	char temp;
    int flag;
    scanf("%[^\n]s", inp);
  	int len = strlen (inp);
    
    for(i = 0; i < len; i++)
    {
        flag = 0;
        for(j = 0 ; j < len; j++)
        {
            if(inp[i] == inp[j] && i!=j )
            {
                flag = 1;
                break;
            }
        }
        if(flag == 0)
        {
            temp = inp[i];
            break;
        }
    }
    if(flag == 0)
    {
        printf("%c", temp);
    }
    else
    {
        printf("All the characters are repetitive");
    }
}