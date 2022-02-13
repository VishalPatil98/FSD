package practiceProject;
import java.util.*;
class LIS 
{
	public static void main(String[] args) 
	{
		int arr[] = { 10, 8, 7, 3, 21, 50,5,71};
		System.out.println("The Given array is :");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    int current_Max;
	    int highestCount = 0;
	    for(int i = 0; i < arr.length;i++)
	    {
	    	current_Max = Integer.MIN_VALUE;
	        for(int j = i;j < arr.length; j++)
	        {
	            if(arr[j] > current_Max)
	            {
	                list.add(arr[j]);
	                current_Max = arr[j];
	            }
	        }	         
	        //Comparing previous highest subsequence
	        if(highestCount < list.size())
	        {
	            highestCount = list.size();
	        }  
	        list.clear();
	    }
	    System.out.println();
	    System.out.println("The Longest subsequence is :"+ highestCount);
	}
}
	
	