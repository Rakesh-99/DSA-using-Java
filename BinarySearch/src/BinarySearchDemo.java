public class BinarySearchDemo
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		int findNum =11;
		int search = binarySearch(arr, findNum);
		
		System.out.println(search);
	
		
	}
	
		public static int binarySearch(int[] arr, int findNum)
		{
			int iIndex = 0;
			int lIndex = arr.length-1;
			int midIndex = (iIndex + lIndex)/2;
			
			while(iIndex <= lIndex)
			{
				if(arr[midIndex] == findNum)
				{
					return midIndex;
				}
				else if(midIndex < findNum)
				{
					iIndex = midIndex+1;
				}
				else
				{
					lIndex = midIndex-1;
				}
				
			}
			return -1;
		}
}