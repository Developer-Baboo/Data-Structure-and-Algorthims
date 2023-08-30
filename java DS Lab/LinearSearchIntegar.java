class LinearSearchIntegar
{
	public static void main(String[] args) 
	{
		int[]arr = {5,3,6,4,2,1};
		int srch = 2;
		int loc = -1;
		for(int i = 0;i<arr.length;i++)
		{
			if(srch==arr[i])
			{
				loc=i;
				System.out.println("Item is present at "+loc+" index");
				break;
			}	
		}
		if(loc==-1)
		{
			System.out.println("Sorry! Item is not found in above list");
		}
	}
}