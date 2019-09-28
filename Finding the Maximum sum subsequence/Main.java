#include<stdio.h>
int main()
{
    int size;
    scanf("%d", & size);
    int arr[size];
    for(int index = 0; index < size; index++)
    {
        scanf("%d", &arr[index]);
    }
    int seq[2 * size];
    int seq_idx = 0;
    int start_idx = 0;


    for(int index = 0 ; index < size-1; index++)
    {
        if(arr[index] > arr[index + 1])
        {
            seq[seq_idx] = start_idx;
            seq_idx++;
            seq[seq_idx] = index;
            seq_idx++;
            start_idx = index + 1;
        }
    }
       
    if(start_idx != size-1)
    {
            seq[seq_idx] = start_idx;
            seq_idx++;
            seq[seq_idx] = size - 1;
            seq_idx++;
    }
       
    if(start_idx == size - 1)
    {
            seq[seq_idx] = start_idx;
            seq_idx++;
            seq[seq_idx] = size - 1;
            seq_idx++;
    }
    int lsum=0,sum=0;   
    for(int index = 0; index <= (seq_idx-1); index = index + 2)
    {
        start_idx = seq[index];
        int end_idx = seq[index + 1];
        for (int idx = start_idx ; idx <= end_idx; idx++)
        {
            sum=sum+ arr[idx];
        }
       if(lsum<sum)
       {
         lsum=sum;
         sum=0;
       }
    }
      printf("%d ",lsum);
   return 0;
}




