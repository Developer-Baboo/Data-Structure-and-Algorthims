//Brute Force Method
// ek element ek bar repate hona chaeya
//time taking method
class FindDuplicateElements1{
    public static void main(String[] args){
        int[] a = {3,4,4,2,2,1};
        System.out.print("Duplicate values are : ");
        for(int i=0; i<a.length-1; i++){
            for(int j=i+1; j<a.length;j++){
                if(a[i] ==a[j] && (i!=j)){
                    System.out.print(a[j]+" ");
                }
            }   
        }
    }
}