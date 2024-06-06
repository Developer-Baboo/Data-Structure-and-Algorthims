public class QuickSort {
    public static void main(String[] args) {
        // Array to be sorted
        int[] arr = {15, 9, 7, 13, 12};
        int leng = arr.length;
        
        // Create an instance of QuickSort
        QuickSort qs = new QuickSort();
        
        // Perform the quicksort on the array
        qs.quickSortRecursion(arr, 0, leng - 1);
        
        // Print the sorted array
        qs.printArray(arr);
    }

    // Method to partition the array and return the partition index
    int partition(int[] arr, int low, int high) {
        // Choose the pivot element
        int pivot = arr[(low + high) / 2];
        
        while (low <= high) {
            // Find the first element greater than or equal to the pivot
            while (arr[low] < pivot) {
                low++;
            }
            
            // Find the first element less than or equal to the pivot
            while (arr[high] > pivot) {
                high--;
            }
            
            // Swap the elements if the low index is less than or equal to the high index
            if (low <= high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        
        // Return the partition index
        return low;
    }

    // Recursive method to apply quicksort on the array
    void quickSortRecursion(int[] arr, int low, int high) {
        // Get the partition index
        int pi = partition(arr, low, high);
        
        // Recursively sort the left side of the pivot
        if (low < pi - 1) {
            quickSortRecursion(arr, low, pi - 1);
        }
        
        // Recursively sort the right side of the pivot
        if (high > pi) {
            quickSortRecursion(arr, pi, high);
        }
    }

    // Method to print the array
    void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}