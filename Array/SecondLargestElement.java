public class SecondLargestElement {
    public static void main(String[] args) {
        // Array to be sorted
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int temp;
        
        // Sort the array in descending order
        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        // List of elements ordered by descending
        System.out.print("Array sorted in descending order: ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // Largest element (first element in the sorted array)
        System.out.println("Largest element: " + a[0]); //8

        // Second largest element (second element in the sorted array)
        System.out.println("Second largest element: " + a[1]); //7

        // Smallest element (last element in the sorted array)
        System.out.println("Smallest element: " + a[a.length - 1]); //1

        // Second smallest element (second last element in the sorted array)
        System.out.println("Second smallest element: " + a[a.length - 2]); //2
    }
}
