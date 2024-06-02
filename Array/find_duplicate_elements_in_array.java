import java.util.Set;
import java.util.HashSet;
public class find_duplicate_elements_in_array {
    // 1st Method: Brute Force Method
    // 1st time ya 1st index wala element sa start kraga, usko zeroth index wala element sa compara krvata jayaga
    // Disadvantages:
    // Take much time in finding duplicate element
    // Bar bar pore list ko check krta ha
    // agr duplicate element 1 sa zyda bar repeat ho rha ha to phir ya method kam ka nhi ha
    // public static void main(String[] args) {
    //     int a[] = {3,5,4,3,2,2,1,1};
    //     System.out.print("Duplicate elements are : ");
    //     for(int i = 0; i<a.length-1; i++){
    //         for(int j = i+1; j<a.length; j++){
    //             if((a[i] == a[j]) && (i!=j)) {
    //                 System.out.print(a[j]+" ");
    //             }
    //         }
    //     }
    // }
    
    
    // 2nd Method: Set Interface
    /* public static void main(String[] args) {
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
    }    */


}
