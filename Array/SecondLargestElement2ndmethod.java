public class SecondLargestElement2ndmethod {
    public static void main(String[] args) {
        // Array to be sorted
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int largest = Integer.MAX_VALUE;
        int second_largest = Integer.MAX_VALUE;
        
        // Sort the array in descending order
        for(int i = 0; i < a.length; i++) {
            if(a[i] > largest) {
                second_largest = largest;
                largest = a[i];
            } else if(a[i] > second_largest) {
                second_largest = a[i];
            }
        }
        if(second_largest == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        }else{
            System.out.println("Second largest element: " + second_largest);
        }
    }
}