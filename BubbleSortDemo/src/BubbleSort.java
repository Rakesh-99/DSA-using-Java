import java.util.Arrays;

public class BubbleSort
{
	public static void main(String[] args)
	{
	
		int[] arr = {9,8,7,6,5,54,3,2,29,1};
		
		System.out.print("Before Sorting the Array Value was : ");
		System.out.println(Arrays.toString(arr));
		
		for(int i =0; i < arr.length; i++)
			
		{
			for(int j = 0; j < arr.length-1-i; j++)
			{
				
				int temp = 0; 
				
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.print("After Sorting, The Array value is :");
		System.out.println(Arrays.toString(arr));
	}
}