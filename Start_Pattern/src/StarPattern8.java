public class StarPattern8 {
    public static void main(String args[]){
        for(int i = 1; i<=10; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }

            for(int k = 9; k>=i; k--){
                System.out.print(" ");
            }

            for(int l = 10; l>=i; l--){
                System.out.print(" ");
            }

            for(int m = 1; m<=i; m++){
                System.out.print("*");
            }


            System.out.println();
        }

        //below part
        for(int i = 1; i<=10; i++){
            for(int j = 9; j>=i; j--){
                System.out.print("*");
            }

            for(int k = 1; k<=i; k++){
                System.out.print(" ");
            }

            for(int l = 0; l<=i; l++){
                System.out.print(" ");
            }

            for(int m = 10; m>i; m--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
