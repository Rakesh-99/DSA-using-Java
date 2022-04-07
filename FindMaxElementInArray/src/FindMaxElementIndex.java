public class FindMaxElementIndex
{
	public static void main(String[] args)
	{
		
	 //Find the index of max element in array .
		
		
		
		int[] arr = {1,2,3,4,5,6,101,7,8,9,10,24,28};
		
		System.out.println(findMaxNo(arr));
		
		
	}
	
	public static int findMaxNo(int[] arr)
	{
		int iVal = 0;
		for(int i = 0; i< arr.length; i++)
		{
			if(arr[iVal] < arr[i])
			{
				iVal = i;
			}
		}
		return iVal;
	}
}