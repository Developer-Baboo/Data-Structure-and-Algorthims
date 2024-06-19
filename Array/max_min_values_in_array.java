/* public class max_min_values_in_array {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int max = arr[0];
        // int min = arr[0];
        for(int i = 1; i<arr.length; i++){
            // Zeroth index sa konse element bra ha jasa usko bra elmenet milaga, max ke value usa change krdoonga
            if(arr[i]> max){    
                max = arr[i];
            }
        }

        System.out.print("largest element is: " + max);
    }
} */


public class max_min_values_in_array {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int min = arr[0];
        // int min = arr[0];
        for(int i = 1; i<arr.length; i++){
            // Zeroth index sa konse element chota ha jasa usko chota  elmenet milaga, min ke value usa change krdoonga
            if(arr[i]< min){    
                min = arr[i];
            }
        }

        System.out.print("smallest element is: " + min);
    }
}
