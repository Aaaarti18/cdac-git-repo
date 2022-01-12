#include<stdio.h>
int main()
{
    int start,end,n=4,i,j;
    int arr[4][4]={{2,3,4,5},{1,2,3,4},{6,7,8,9},{2,5,7,3}};
    for(start=0,end=n-1;start<=end,start++;end--)
    {
        for(i=start;i<=end;i++)
        {
            printf("%d",arr[start][i]);
        }
        for(i=start+1;i<=end;i++)
        {
            printf("%d",arr[i][end]);
        }
        for(i=end-1;i>=end;i--)
        {
            printf("%d",arr[end][i]);
        }
        for(i=end-1;i>=start+1;i--)
        {
            printf("%d",arr[i][start]);
        }
    }
}