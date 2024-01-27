class LinearSearch
{
	public static void main(String[] args)
	{
		int arr[] = {5,3,6,1,4,2};
		int item = 1;
		int temp = 0;
		for(int i = 0; i<arr.length;i++)
		{
			if(arr[i] == item)
			{
				System.out.println("Item is present at "+i+" index positon");
				temp =  temp+1;
			}
		}
		if(temp == 0)
		{
			System.out.println("Element is not present in the list");
		}
	}
}