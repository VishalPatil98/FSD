package searching;

import java.util.Scanner;
import java.util.*;
public class ExponentialSearch
{
	public static  void main(String[] args)
	{
	    int[] arr = {6,12,18,24,32};
	    int length= arr.length;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the element to be searched:");
	    int value =sc.nextInt();
	    int outcome = exponentialSearch(arr,length,value);
	    if(outcome<0)
	    {
	    	System.out.println( "Element is not present in the array");
	    }
	    else
	    {
	
	        System.out.println( "Element is  present in the array at index :"+outcome);
	    }

	}

        public static int exponentialSearch(int[] arr ,int length, int value )
        {
        	if(arr[0]==value)
        	{
        		return 0;
            }
        	int i=1;
        	while(i<length && arr[i]<=value)
        	{
        		i=i*2;
        	}
        	return Arrays.binarySearch(arr,i/2,Math.min(i,length),value);
       }

}
