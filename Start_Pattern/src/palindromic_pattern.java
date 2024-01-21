public class palindromic_pattern {
    public static void main(String[] args) {
        for(int i = 1; i<=5; i++){
            for(int j=5; j>=i; j--){
                System.out.print(" ");
            }
            for(int l=i; l>=1; l--){
                System.out.print(l);
            }
            for(int m=2; m<=i; m++){
                System.out.print(m);
            }
            System.out.println();
        }
    }
}