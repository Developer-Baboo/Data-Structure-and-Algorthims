import java.util.*;
class LinearSrchString
{
	public static void main(String[] args) 
	{
		String[] arr = {"Baboo","Suhail", "Rajesh", "Akash", "Ramesh", "Jeewat"};
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name which you wanna Search:");
		String srch = sc.nextLine(); 
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i].equals(srch))
			{
				System.out.print("Name is present at "+i+" index position");
				temp = temp+1;
			}
		}
		if(temp==0)
		{
			System.out.print("Sorry! name is not found in the list");
		}	
	}
}