
/*
Q. return the index value of given input and return negetive no. if the element 
is not present in Array !
*/

public class LinearSearchDemo
{
	public static void main(String[] args)
	{
		int[] arr = {20,10,11,43,21,26,16,19};
		
		int numIndex = 16;
		int search = linearSearch(arr, numIndex);
		System.out.println(search);
	
	
		
	}
	public static int linearSearch(int[] arr, int numIndex)
	{
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == numIndex)
			{
				return i;
			}
		}
		return -1;
	}
}