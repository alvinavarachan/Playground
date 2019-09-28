#include <stdio.h>
#include <stdlib.h>
int add(int num)
{
    if(num != 0)
    {
        return num + add(num -1);
    }
    else
    {
        return num;
    }
}

int main()
{
    int num;
  	scanf("%d", &num);
   int sum = add(num);
    printf("%d", sum);
    return 0;
}

