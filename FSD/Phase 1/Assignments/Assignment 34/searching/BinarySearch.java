package searching;
import java.util.*;
public class BinarySearch
{

    public static  void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	int[] arr = {3,6,9,12,15};
        System.out.println("Enter the element to be searched");
        int key = sc.nextInt();;
        int arrlength = arr.length;
        binarySearch(arr,0,key,arrlength);
    }
    public static void binarySearch(int[] arr, int lb, int key, int ub)
    {
    	int midValue = (lb+ub)/2;
        while(lb<=ub)
        {
        	if(arr[midValue]<key)
        	{

                lb = midValue + 1;
            } 
        	else if(arr[midValue]==key)
        	{
                System.out.println("Element is found at index :"+midValue);
                break;
            }
            else 
            {

                ub=midValue-1;
            }
            midValue = (lb+ub)/2;
        }
        if(lb>ub)
        {
        	System.out.println("Element is not found");
        }
    }

}

