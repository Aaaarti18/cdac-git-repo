//sum of outer element of 2d array

#include<stdio.h>
int main()
{
    int i,j=0,n=4;
    int sum=0;
    int arr[4][4]={{2,3,4,5},{1,2,3,4},{6,7,8,9},{2,5,7,3}};
    for(i=0;i<4;i++)
    {
        for(j=0;j<4;j++)
        {
            if((i==0)||(j==0)||(i==n-1)||(j==n-1))
            {
                sum=sum+arr[i][j];  
            }
        }
    }
    printf("\nSum of boundary is %d", sum);
  



}