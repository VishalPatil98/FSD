package array;
import java.util.*;
public class SingleDiamensionalArray {

	public static void main(String[] args)
	{
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How Many Elements You Want To Add :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for (int i = 0; i < n; i++)
		{
			System.out.println("Enter Array Elements :");
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Eneterd Array is :");
		
		for (int i = 0; i <n; i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int i = 0; i<n; i++ )
		{
	         for(int j = i+1; j<n; j++)
	         {
	            if(arr[i]>arr[j])
	            {
	               temp = arr[i];
	               arr[i] = arr[j];
	               arr[j] = temp;
	            }
	         }
	      }
		System.out.println("Smallest Number in Array is :"+arr[0]);
		for(int i = 0; i<n; i++ )
		{
	         for(int j = i+1; j<n; j++)
	         {
	            if(arr[i]arr[j])
	            {
	               temp = arr[i];
	               arr[i] = arr[j];
	               arr[j] = temp;
	            }
	         }
	      }
		System.out.println("Largest Number in Array is :"+arr[0]);
	}
	
	
	
}
