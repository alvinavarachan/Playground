#include<stdio.h>
#include<string.h>
int main()
{
 	int i,len, k = 0;
    char inp[100], temp[50];
    scanf("%[^\n]s", inp);
    len= strlen (inp);
    for(i = 0; i < len ; i++)
    {
        if((inp [i] == 't' || 'T') && inp [i + 1] == 'h' && inp [i + 2] == 'e')
        {
            i = i + 3;
        }
        else
        {
           temp [k] = inp[i];
           k++;
        }
    }
    temp[k] = '\0';
    printf("%s\n", temp);
    return 0;
}