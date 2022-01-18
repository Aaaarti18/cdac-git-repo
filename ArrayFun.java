import java.util.Scanner;

public class ArrayFun {

	public static void main(String[] args)
	{
		int []arr = new int[5];

		Scanner a = new Scanner(System.in);
		
		
		 accept(arr,a);
		 sort_the_array(arr);
		 Display(arr);
		
		
		//accept(arr, a);
		//left_rotate(arr);
	    //Display(arr);
		
		//accept(arr, a);
		//right_rotate(arr);
		//Display(arr);
		
		//accept(arr, a);
		//insert_array(arr);
		//Display(arr);
		
		//accept(arr, a);
		//delete(arr);
		//Display(arr);
	}
	static void accept(int []arr,Scanner a)
	{
		System.out.println("Enter Elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = a.nextInt();

		}
		
	}
	static void Display(int []arr)
	{
		
		for(int i=0;i<arr.length;i++)
		{

			System.out.print(arr[i] + " ");

		}
		System.out.println();

	}
	static void left_rotate(int []arr)
	{
		int i;
		int temp =arr[0];

		for(i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[i]=temp;
	}
	static void right_rotate(int []arr)
	{
		int i,temp;
		temp =arr[arr.length-1];

		for(i=(arr.length-1);i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[i]=temp;
	}
	static void sort_the_array(int []arr)
	{
		int smalno,i,j;

		int index;
		for( i=0;i<arr.length-1;i++)
		{
			index=i;


			for( j= i+1;j<arr.length-1;j++)
			{
				if(arr[j]<arr[index])
				{
					index=j;
				}

			}

			smalno = arr[index];
			arr[index] = arr[i];
			arr[i] =  smalno;
		
		}
	}
        static void insert_array(int []arr)
        {
        	int i;
        	int key,pos;
        	pos=2;
        	key=7;
        	
        	for( i=arr.length-1;i>=pos;i--)
        	{
        		arr[i]=arr[i-1];
        		
        	}
        	arr[i]=key;
        }
        static void delete(int []arr)
        {
        	int i;
        	int pos=3;
        	
        	for(i=pos-1;i<arr.length-1;i++)
        	{
        		arr[i]=arr[i+1];
        	}
        	arr[i]=0;
        }




}


