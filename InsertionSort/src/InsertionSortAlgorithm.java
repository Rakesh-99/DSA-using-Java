import java.util.Arrays;

public class InsertionSortAlgorithm
{
	public static void main(String[] args)
	{
	
		int[] arr = {20,12,4,9,22,1,3,99,35,23,5};
		
		System.out.print("Before sorting the Array was :");
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		for(int i = 1; i < arr.length; i++)
		{
			int temp = arr[i];
			int j = i-1;
			
			while(j >= 0  && arr[j] > temp)
			{
				arr[j+1] = arr[j];
				  j--;
			}
				arr[j+1] = temp;
				
		}
		System.out.print("After Sorting the Array would be :");
		System.out.println(Arrays.toString(arr));
		
	}
}


/*
output : 
	
	Before sorting the Array was :[20, 12, 4, 9, 22, 1, 3, 99, 35, 23, 5]

    After Sorting the Array would be :[1, 3, 4, 5, 9, 12, 20, 22, 23, 35, 99]

*/