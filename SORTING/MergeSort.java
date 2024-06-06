public class MergeSort {
    int[] array;          // The main array to be sorted
    int[] tempMergeArr;   // Temporary array used for merging
    int length;           // Length of the main array

    public static void main(String[] args) {
        // Array to be sorted
        int[] inputArr = {48, 36, 13, 52, 19};
        
        // Create an instance of MergeSort and sort the array
        MergeSort ms = new MergeSort();
        ms.sort(inputArr);
        
        // Print the sorted array
        for(int i : inputArr) {
            System.out.print(i + " ");
        }
    }

    // Method to initiate the merge sort
    public void sort(int[] inputArr) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergeArr = new int[length];
        // Start the divide and conquer process
        divideArray(0, length - 1);
    }

    // Method to divide the array into subarrays
    public void divideArray(int lowerIndex, int higherIndex) {
        // Recursively divide the array until the subarrays have one element each
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            
            // Sort the left side of the array
            divideArray(lowerIndex, middle);
            
            // Sort the right side of the array
            divideArray(middle + 1, higherIndex);
            
            // Merge the sorted subarrays
            mergeArray(lowerIndex, middle, higherIndex);
        }
    }

    // Method to merge the divided arrays
    public void mergeArray(int lowerIndex, int middle, int higherIndex) {
        // Copy the subarray into the temporary array
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergeArr[i] = array[i];
        }
        
        int i = lowerIndex;    // Initial index of the left subarray
        int j = middle + 1;    // Initial index of the right subarray
        int k = lowerIndex;    // Initial index to be sorted
        
        // Merge the subarrays back into the main array
        while (i <= middle && j <= higherIndex) {
            if (tempMergeArr[i] <= tempMergeArr[j]) {
                array[k] = tempMergeArr[i];
                i++;
            } else {
                array[k] = tempMergeArr[j];
                j++;
            }
            k++;
        }
        
        // Copy the remaining elements of the left subarray, if any
        while (i <= middle) {
            array[k] = tempMergeArr[i];
            k++;
            i++;
        }
    }
}