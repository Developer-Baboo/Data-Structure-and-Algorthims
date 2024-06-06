public class insertion_sort {
    public static void main(String[] args) {
        // Array to be sorted
        int[] a = {5, 1, 6, 4, 3};
        
        // Variables used in the sorting algorithm
        int temp, j;
        
        // Outer loop iterates from the second element to the end of the array
        for(int i = 1; i < a.length; i++) {
            // Store the current element in temp
            temp = a[i];
            // Initialize j to the current index
            j = i;
            
            // Inner loop to shift elements of the sorted portion of the array to the right
            // to create the correct position for the current element
            while(j > 0 && a[j-1] > temp) {
                // Shift the element to the right
                a[j] = a[j-1];
                // Decrement j to continue checking the previous elements
                j = j - 1;
            }
            // Place the current element in its correct position
            a[j] = temp;
        }
        
        // Print the sorted array
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}