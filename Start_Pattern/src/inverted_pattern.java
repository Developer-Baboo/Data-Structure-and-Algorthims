public class inverted_pattern {
    public static void main(String[] args) {
        int count = 1;
        for(int i = 5; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            // count = count-1;
            System.out.println();
        }
    }
}
