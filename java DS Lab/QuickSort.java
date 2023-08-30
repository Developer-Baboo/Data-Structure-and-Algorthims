import java.util.*;
public class QuickSort
{
	private static int[] numbers = {90,50,30,20,80,10,40,100,70,60};
	private static int number;
	
	public static void main(String[] args) 
	{
		sort(numbers);
		System.out.println(Arrays.toString(numbers));	
	}

	public static void sort(int[] values)
	{
	 	if(values == null || values.length==0 )
	 	{
	 		return;
	 	}
	 	numbers = values;
	 	number = values.length;
	 	quicksort(0, number-1);
	}

	private static void quicksort(int low, int high)
	{
	 	int i = low,  j = high;
	 	int pivot = numbers[(low+high)/2];
	 	while(i<=j)
	 	{
	 		while(numbers[i] < pivot )
	 		{
	 			i++;
	 		}
	 		while(numbers[j] > pivot )
	 		{
	 			j--;
	 		}
	 		{
	 			exchange(i, j);
		 		i++;
		 		j--;
	 		}
	 	}
		// Recursion
		if(low<j)
		 	quicksort(low,j);
		if (i< high)
		 	quicksort(i,high); 
	}
	private static void exchange(int i, int j)
	{
	 	int temp = numbers[i];
	 	numbers[i] = numbers[j];
	 	numbers[j] = temp;
	}

}