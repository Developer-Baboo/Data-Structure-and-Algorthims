public class number_traingular {
    public static void main(String[] args) {
        // int 
        for(int i = 1; i<=4; i++){
            for(int j = 4; j>=i; j--){
                System.out.print(" ");
            }
            for(int k = i; k<=i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}