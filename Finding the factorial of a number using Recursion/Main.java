#include <stdio.h>
 
int fact( int num)
{
    if (num == 0 )
    {
        return 1;
    }
    
        return (num * fact(num - 1));
    
}
 
int main()
{
    int num;
    int res;
    scanf("%d", &num);
    res = fact(num);
    printf("%d\n", res);
    return 0;
}
