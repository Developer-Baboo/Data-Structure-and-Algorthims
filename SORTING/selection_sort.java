class SelectionSort
{
    public static void main(String[] args)
    {
        // Array to be sorted
        int[] a = {38, 52, 9, 18, 6, 62, 13};
        
        // Variable to hold the index of the minimum value in the unsorted portion of the array
        int min;
        
        // Temporary variable used for swapping elements
        int temp = 0;
        
        // Outer loop iterates over the entire array
        for(int i = 0; i < a.length; i++){
            // Assume the minimum value is at the current position i
            min = i;
            
            // Inner loop to find the actual minimum value in the remaining unsorted portion of the array
            for(int j = i+1; j < a.length; j++){
                // If the current element is less than the current minimum, update the minimum index
                if(a[j] < a[min]){
                    min = j;
                }
            }
            
            // Swap the current element with the found minimum element
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        
        // Print the sorted array
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
