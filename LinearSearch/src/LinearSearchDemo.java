
import java.util.Scanner;;


public class LinearSearchDemo
{
	public static void main(String[] args)
	{
		
		
		
		int[] arr = {23,11,44,21,1,5,3,9,26,41};
		
		int findNum =41;
		
		int search = linearSearch(arr, findNum);
		
		System.out.println(search);
		
	}
	
	public static int linearSearch(int[] arr, int findNum)
	{
		
		for(int i =0 ; i < arr.length; i++)
		{
			if(arr[i] == findNum)
			{
				return i;
			}
		}
		return -1;
	}

}
	