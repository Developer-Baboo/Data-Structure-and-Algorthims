public class HeapSort {
    public static void main(String[] args) {
        // Array to be sorted
        int[] arr = {22, 13, 1, 5, 7, 8};
        
        // Create an instance of HeapSort
        HeapSort heapSort = new HeapSort();
        
        // Perform heap sort on the array
        heapSort.sort(arr);
        
        // Print the sorted array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // Method to perform heap sort
    void sort(int[] arr) {
        int leng = arr.length;
        
        // Build a max heap
        for (int i = leng / 2 - 1; i >= 0; i--) {
            heapify(arr, leng, i);
        }
        
        // Extract elements from the heap one by one
        for (int i = leng - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            
            // Call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // Method to heapify a subtree rooted with node i which is an index in arr[]
    void heapify(int[] arr, int leng, int i) {
        int largest = i;  // Initialize largest as root
        int li = 2 * i + 1;  // Left child index
        int ri = 2 * i + 2;  // Right child index
        
        // If left child is larger than root
        if (li < leng && arr[li] > arr[largest]) {
            largest = li;
        }
        
        // If right child is larger than largest so far
        if (ri < leng && arr[ri] > arr[largest]) {
            largest = ri;
        }
        
        // If largest is not root
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            
            // Recursively heapify the affected subtree
            heapify(arr, leng, largest);
        }
    }
}