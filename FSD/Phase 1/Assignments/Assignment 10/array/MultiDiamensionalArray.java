package array;
import java.util.*;
public class MultiDiamensionalArray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[2][2];
		for (int i = 0; i < 2; i++) 
		{
			for (int j = 0; j < 2; j++)
			{
				System.out.println("Enter Elements :");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Printing Matrix :");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
