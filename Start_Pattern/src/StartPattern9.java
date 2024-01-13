public class StartPattern9 {
    public static void main(String args[]){
        for(int i = 1; i<=10; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(" ");
            }

            for(int k = 9; k>=i; k--){
                System.out.print("*");
            }

            for(int l = 10; l>=i; l--){
                System.out.print("*");
            }

            System.out.println();
        }

        //below part
        for(int i = 1; i<=10; i++){
            for(int j = 10; j>=i; j--){
                System.out.print(" ");
            }

            for(int k = 1; k<=i; k++){
                System.out.print("*");
            }

            for(int l = 1; l<=i; l++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
