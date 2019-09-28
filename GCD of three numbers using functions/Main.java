#include <stdio.h>
int gcd2(int n1, int n2);
int main() {
	int n1, n2, n3;
	scanf("%d%d%d", &n1, &n2, &n3);
	int result = gcd2(n1, n2);
	printf("%d", gcd2(result, n3));
	return 0;
}
int gcd2(int n1, int n2)
{
    int small = 0, gcd = 0;
    if(n1 < n2)
    {
        small = n1;
    }
    else{
        small = n2;
    }
    while(small > 1)
    {
        if((n1 % small == 0) && (n2 % small == 0))
        {
            gcd = small;
            break;
        }
    }
    return gcd;
}