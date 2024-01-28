import java.util.Set;
import java.util.HashSet;
public class find_duplicate_elements_in_array {
    // // Brute Force Method
    // public static void main(String[] args) {
    //     int a[] = {3,5,4,3,2,2,1,1};
    //     System.out.print("Duplicate elements are : ");
    //     for(int i = 0; i<a.length; i++){
    //         for(int j = i+1; j<a.length; j++){
    //             if((a[i] == a[j]) && (i!=j)) {
    //                 System.out.print(a[j]+" ");
    //             }
    //         }
    //     }
    // }
    
    
    // Set Interface
    public static void main(String[] args) {
        // It will print the 3 times element as o 2 time.
        // agr koe element 2 bar repeat hota ha to wo do bar pnt hoga 
        
        int arr[] = {3,5,4,3,2,2,1,1};
        System.out.print("Duplicate elements are : ");
        Set<Integer> s = new HashSet<>();
        for(int no:arr){
            if(s.add(no) == false){
                System.out.print(no+" ");
            }
        } 
    }   
}
