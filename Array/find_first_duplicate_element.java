public class find_first_duplicate_element {
    public static void main(String[] args) {
        // Initialize an array with some integer elements.
        int arr[] = {6, 5, 2, 5, 1, 2, 4};

        // Outer loop iterates through each element of the array.
        for (int i = 0; i < arr.length; i++) {
            // Inner loop compares the current element with every other element before it.
            for (int j = 0; j < i; j++) {
                // If a duplicate is found, print the element and exit the program.
                if (arr[i] == arr[j]) {
                    System.out.println("First Duplicate Element is " + arr[i]);
                    return; // Exit the main method once the first duplicate is found.
                }
            }
        }

        // If no duplicates are found after checking all elements, print this message.
        System.out.println("No Duplicate Element");
    }
}
